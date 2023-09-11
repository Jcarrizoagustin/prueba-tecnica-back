package com.example.pruebatecnica.services;

import com.example.pruebatecnica.model.Paciente;
import com.example.pruebatecnica.repositories.PacienteRepository;
import org.springframework.stereotype.Service;

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
            throw new RuntimeException("Paciente no encontrado");
        }
    }
}
