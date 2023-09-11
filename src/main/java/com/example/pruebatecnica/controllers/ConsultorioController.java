package com.example.pruebatecnica.controllers;

import com.example.pruebatecnica.model.Consultorio;
import com.example.pruebatecnica.services.ConsultorioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/consultorios")
public class ConsultorioController {

    private final ConsultorioService consultorioService;

    public ConsultorioController(ConsultorioService consultorioService){
        this.consultorioService = consultorioService;
    }

    @GetMapping
    public ResponseEntity<List<Consultorio>> listadoConsultorios(){
        return ResponseEntity.ok(consultorioService.listado());
    }
}
