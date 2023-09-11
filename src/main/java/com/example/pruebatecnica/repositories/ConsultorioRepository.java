package com.example.pruebatecnica.repositories;

import com.example.pruebatecnica.model.Consultorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio,Long> {
}
