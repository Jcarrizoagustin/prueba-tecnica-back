package com.example.pruebatecnica.repositories;

import com.example.pruebatecnica.model.Consultorio;
import com.example.pruebatecnica.model.Doctor;
import com.example.pruebatecnica.model.Paciente;
import com.example.pruebatecnica.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface TurnoRepository extends JpaRepository<Turno,Long> {

    List<Turno> findAllByDoctor(Doctor doctor);

    List<Turno> findAllByPaciente(Paciente paciente);

    List<Turno> findAllByConsultorio(Consultorio consultorio);

    List<Turno> findAllByDiaAndHora(LocalDate dia, LocalTime hora);
}
