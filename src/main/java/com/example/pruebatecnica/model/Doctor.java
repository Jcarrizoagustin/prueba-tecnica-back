package com.example.pruebatecnica.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@Entity
@Table(name = "doctores")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",length = 20,nullable = false )
    private String nombre;

    @Column(name = "apellido",length = 20,nullable = false )
    private String apellido;

    @Column(name = "matricula",nullable = false,unique = true )
    private String matricula;

    @Column(name = "telefono",nullable = false,unique = true )
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "especialidad_id",
            foreignKey = @ForeignKey(name = "ESPECIALIDAD_ID_FK")
    )
    private Especialidad especialidad;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HorarioAtencion> horarios = new ArrayList<>();



    // Este metodo verifica si el doctor atiende en cierto dia y hora
    public boolean estaDisponible(LocalDate dia, LocalTime hora){

        Optional<HorarioAtencion> diaDisponible = this.horarios.stream()
                .filter(horario -> horario.getDiaDeLaSemana().equals(dia.getDayOfWeek().getValue()))
                .findFirst();

        //Verificamos que el dia pasado se encuentre entre los dias que el doctor atiende
        if(diaDisponible.isEmpty()){
            return false;
        }

        //Verificamos que el horario pasado por parametro se encuentre en el rango de horas que prevee atender
        return (diaDisponible.get().getHoraInicio().isBefore(hora) || diaDisponible.get().getHoraInicio().equals(hora)) && diaDisponible.get().getHoraFin().isAfter(hora);

    }
}
