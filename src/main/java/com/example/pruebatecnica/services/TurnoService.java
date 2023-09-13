package com.example.pruebatecnica.services;

import com.example.pruebatecnica.dtos.turno.TurnoRequestDTO;
import com.example.pruebatecnica.exceptions.*;
import com.example.pruebatecnica.model.Consultorio;
import com.example.pruebatecnica.model.Doctor;
import com.example.pruebatecnica.model.Paciente;
import com.example.pruebatecnica.model.Turno;
import com.example.pruebatecnica.repositories.TurnoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class TurnoService {

    private final TurnoRepository turnoRepository;

    private final ConsultorioService consultorioService;
    private final DoctorService doctorService;

    private final PacienteService pacienteService;


    public TurnoService(TurnoRepository turnoRepository, ConsultorioService consultorioService, DoctorService doctorService, PacienteService pacienteService) {
        this.turnoRepository = turnoRepository;
        this.consultorioService = consultorioService;
        this.doctorService = doctorService;
        this.pacienteService = pacienteService;
    }

    public List<Turno> listado(){
        return turnoRepository.findAll();
    }

    public Turno nuevoTurno(TurnoRequestDTO dto){
        LocalDate dia = LocalDate.parse(dto.getDia());
        LocalTime hora = LocalTime.parse(dto.getHora());
        Consultorio consultorio = consultorioService.obtenerConsultorioPorID(dto.getConsultorio_id());
        Paciente paciente = pacienteService.obtenerPacientePorId(dto.getPaciente_id());
        Doctor doctor = doctorService.obtenerDoctorPorId(dto.getDoctor_id());

        if(dia.getDayOfWeek().getValue() == 7 || hora.isBefore(LocalTime.parse("08:00")) || hora.isAfter(LocalTime.parse("23:00"))){
            throw new ClinicaFueraDeServicioException("Error en fecha y/o hora del turno. La clinica solo atiende de Lunes a Sabados en el horario de 8 a 23");
        }

        if(doctor.estaDisponible(dia,hora)){

            if(!consultorioDisponible(consultorio,dia,hora)){
                throw new ConsultorioOcupadoException("El consultorio se encuentra ocupado por otro turno");
            }

            if(!noTieneOtroTurno(doctor,dia,hora)){
                throw new DoctorNoEstaDisponibleException("El doctor tiene agendado otro turno para este dia y hora");
            }
            Turno turno = new Turno();
            turno.setConsultorio(consultorio);
            turno.setDoctor(doctor);
            turno.setPaciente(paciente);
            turno.setDia(dia);
            turno.setHora(hora);

            return turnoRepository.save(turno);
        }else{
            throw new DoctorNoEstaDisponibleException("El doctor no esta disponible en esta fecha y hora");
        }
    }

    public List<Turno> listadoTurnosPorDoctor(Doctor doctor){
        return turnoRepository.findAllByDoctor(doctor);
    }

    List<Turno> listadoPorDiaYHora(LocalDate dia, LocalTime hora){
        return turnoRepository.findAllByDiaAndHora(dia,hora);
    }


    //Verificamos que el doctor no tenga un turno en el dia y hora proporcionados
    public boolean noTieneOtroTurno(Doctor doctor, LocalDate dia, LocalTime hora){
        return listadoTurnosPorDoctor(doctor).stream()
                .noneMatch(horario -> horario.getDia().equals(dia) && horario.getHora().equals(hora));
    }


    //Verificamos que el consultorio no se encuentre ocupado por otro turno para un dia y hora especifico
    public boolean consultorioDisponible(Consultorio consultorio,LocalDate dia, LocalTime hora){
        return listadoPorDiaYHora(dia,hora)
                .stream().noneMatch(turno -> turno.getConsultorio().equals(consultorio));
    }

    public Turno modificarTurno(TurnoRequestDTO dto, Long id) {
        Optional<Turno> turnoOptional = turnoRepository.findById(id);
        if(turnoOptional.isEmpty()){
            throw new EntidadNoEncontradaException("El turno no se encuentra registrado");
        }
        Turno turno = turnoOptional.get();

        if(!turno.sePuedeModificarOCancelar()){
            throw new TurnoNoSePuedeCancelarOModificarException("El turno es en menos de una hora por lo que no se puede cancelar o modificar");
        }

        Consultorio consultorio = consultorioService.obtenerConsultorioPorID(dto.getConsultorio_id());
        LocalDate dia = LocalDate.parse(dto.getDia());
        LocalTime hora = LocalTime.parse(dto.getHora());
        Doctor doctor = doctorService.obtenerDoctorPorId(dto.getDoctor_id());

        if(!consultorioDisponible(consultorio,dia,hora)){
            throw new ConsultorioOcupadoException("El consultorio se encuentra ocupado por otro turno");
        }
        if(!doctor.estaDisponible(dia,hora)){
            throw new DoctorNoEstaDisponibleException("El doctor no atiende en estos horarios");
        }
        if(!noTieneOtroTurno(doctor,dia,hora)){
            throw new DoctorNoEstaDisponibleException("El doctor tiene agendado otro turno para este dia y hora");
        }
        turno.setDia(dia);
        turno.setHora(hora);
        turno.setConsultorio(consultorio);

        return turnoRepository.save(turno);

    }

    public void eliminarTurno(Long id) {
        Optional<Turno> turnoOptional = turnoRepository.findById(id);
        if(turnoOptional.isEmpty()){
            throw new EntidadNoEncontradaException("El turno no se encuentra registrado");
        }
        Turno turno = turnoOptional.get();
        if(turno.sePuedeModificarOCancelar()){
            turnoRepository.delete(turno);
        }else{
            throw new TurnoNoSePuedeCancelarOModificarException("El turno es en menos de una hora por lo que no se puede cancelar o modificar");
        }
    }

    public List<Turno> listadoTurnosPendientes() {
        return this.listado().stream()
                .filter(turno -> turno.getDia().isAfter(LocalDate.now().minusDays(1)) && turno.getHora().isAfter(LocalTime.now()))
                .toList();
    }

    public List<Turno> listadoTurnosPorIDPaciente(Long id){
        Paciente paciente = pacienteService.obtenerPacientePorId(id);
        return turnoRepository.findAllByPaciente(paciente);
    }
}
