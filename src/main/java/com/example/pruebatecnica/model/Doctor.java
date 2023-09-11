package com.example.pruebatecnica.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Doctor {
    private String nombre;

    private String apellido;

    private String matricula;

    private Especialidad especialidad;

    //private List<HorarioAtencion> horarios;

    private List<Turno> turnos;

}
