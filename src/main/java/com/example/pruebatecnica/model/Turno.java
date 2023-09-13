package com.example.pruebatecnica.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "turnos")
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dia",nullable = false)
    private LocalDate dia;
    @Column(name = "hora",nullable = false)
    private LocalTime hora;
    @ManyToOne
    @JoinColumn(name = "paciente_id",
            foreignKey = @ForeignKey(name = "PACIENTE_ID_FK")
    )
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "doctor_id",
            foreignKey = @ForeignKey(name = "DOCTOR_ID_FK")
    )
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "consultorio_id",
            foreignKey = @ForeignKey(name = "CONSULTORIO_ID_FK")
    )
    private Consultorio consultorio;


    //Verifica si la hora actual es menor que una hora antes del turno para poder cancelarlo o modificarlo
    public boolean sePuedeModificarOCancelar(){
        return LocalTime.now().isBefore(hora.minusHours(1));
    }
}
