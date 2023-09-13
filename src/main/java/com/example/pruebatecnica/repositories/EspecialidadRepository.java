package com.example.pruebatecnica.repositories;

import com.example.pruebatecnica.model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad,Long> {

    Optional<Especialidad> findByDescripcion(String descripcion);
}
