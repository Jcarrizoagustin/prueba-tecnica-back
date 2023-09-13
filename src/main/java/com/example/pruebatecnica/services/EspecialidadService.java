package com.example.pruebatecnica.services;

import com.example.pruebatecnica.model.Especialidad;
import com.example.pruebatecnica.repositories.EspecialidadRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadService {

    private final EspecialidadRepository especialidadRepository;

    public EspecialidadService(EspecialidadRepository especialidadRepository){
        this.especialidadRepository = especialidadRepository;
    }

    public List<Especialidad> listado(){
        return especialidadRepository.findAll();
    }

    public Optional<Especialidad> buscarPorDescripcion(String descripcion){
        if(descripcion.equals("clinica-medica")){
            return especialidadRepository.findByDescripcion("clinica medica");
        }
        return especialidadRepository.findByDescripcion(descripcion);
    }
}
