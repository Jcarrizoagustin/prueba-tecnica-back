package com.example.pruebatecnica.services;

import com.example.pruebatecnica.model.Consultorio;
import com.example.pruebatecnica.repositories.ConsultorioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultorioService {

    private final ConsultorioRepository consultorioRepository;

    public ConsultorioService(ConsultorioRepository consultorioRepository){
        this.consultorioRepository = consultorioRepository;
    }

    public List<Consultorio> listado(){
        return consultorioRepository.findAll();
    }
}
