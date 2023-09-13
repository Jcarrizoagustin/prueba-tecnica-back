package com.example.pruebatecnica.controllers;

import com.example.pruebatecnica.model.Doctor;
import com.example.pruebatecnica.services.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api/v1/doctores")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public ResponseEntity<List<Doctor>> listadoDoctores(){
        return ResponseEntity.ok(doctorService.listado());
    }

    @GetMapping("/{especialidad}")
    public ResponseEntity<List<Doctor>> listadoDoctoresPorEspecialidad(@PathVariable String especialidad){
        return ResponseEntity.ok(doctorService.listadoPorEspecialidad(especialidad));
    }
}
