package com.example.pruebatecnica.repositories;

import com.example.pruebatecnica.model.Doctor;
import com.example.pruebatecnica.model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    List<Doctor> findAllByEspecialidad(Especialidad especialidad);
}
