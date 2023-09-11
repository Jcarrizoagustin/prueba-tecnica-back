package com.example.pruebatecnica.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class Turno {

    private LocalDate dia;
    private LocalTime hora;
    private Paciente paciente;
    private Doctor doctor;
    private Consultorio consultorio;


    private boolean puedeModificar(){
        return hora.isBefore(LocalTime.now().minusHours(1));
    }
}
