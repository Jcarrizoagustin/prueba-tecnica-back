package com.example.pruebatecnica.controllers;

import com.example.pruebatecnica.model.Especialidad;
import com.example.pruebatecnica.services.EspecialidadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api/v1/especialidades")
public class EspecialidadController {

    private final EspecialidadService especialidadService;

    public EspecialidadController(EspecialidadService especialidadService) {
        this.especialidadService = especialidadService;
    }

    @GetMapping
    public ResponseEntity<List<Especialidad>> listado(){
        return ResponseEntity.ok(especialidadService.listado());
    }
}
