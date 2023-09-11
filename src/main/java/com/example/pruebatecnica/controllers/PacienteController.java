package com.example.pruebatecnica.controllers;

import com.example.pruebatecnica.model.Paciente;
import com.example.pruebatecnica.services.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/v1/pacientes")
public class PacienteController {

    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService){
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> todosLosPacientes(){
        return ResponseEntity.ok(pacienteService.obtenerTodosLosPacientes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> pacientePorId(@PathVariable Long id){
        return ResponseEntity.ok(pacienteService.obtenerPacientePorId(id));
    }


}
