package com.example.pruebatecnica.services;

import com.example.pruebatecnica.dtos.paciente.PacienteRequestDTO;
import com.example.pruebatecnica.exceptions.EntidadNoEncontradaException;
import com.example.pruebatecnica.exceptions.PacienteExistenteException;
import com.example.pruebatecnica.model.Paciente;
import com.example.pruebatecnica.repositories.PacienteRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> obtenerTodosLosPacientes(){
        return pacienteRepository.findAll();
    }

    public Paciente obtenerPacientePorId(Long id){
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        if(paciente.isPresent()){
            return paciente.get();
        }else{
            throw new EntidadNoEncontradaException("Paciente no encontrado");
        }
    }

    public Paciente nuevoPaciente(PacienteRequestDTO dto) {
        if(pacienteRepository.existsByDni(dto.getDni())){
            throw new PacienteExistenteException("El paciente con dni " + dto.getDni()+ " ya se encuentra registrado.");
        }
        Paciente paciente = new Paciente();
        paciente.setNombre(dto.getNombre());
        paciente.setApellido(dto.getApellido());
        paciente.setDni(dto.getDni());
        paciente.setTelefono(dto.getTelefono());
        paciente.setCorreo(dto.getCorreo());
        LocalDate fechaNacimiento = LocalDate.parse(dto.getFechaNacimiento());
        paciente.setFechaNacimiento(fechaNacimiento);

        return pacienteRepository.save(paciente);
    }
}
