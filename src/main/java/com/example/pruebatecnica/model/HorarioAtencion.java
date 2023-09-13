package com.example.pruebatecnica.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "horarios")
public class HorarioAtencion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dia")
    private Integer diaDeLaSemana;
    @Column(name = "inicio")
    private LocalTime horaInicio;
    @Column(name = "fin")
    private LocalTime horaFin;


}
