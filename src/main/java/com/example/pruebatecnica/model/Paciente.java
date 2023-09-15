package com.example.pruebatecnica.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30,nullable = false,name = "nombre")
    private String nombre;

    @Column(length = 30,nullable = false,name = "apellido")
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(length = 8,nullable = false,name = "dni",unique=true)
    private String dni;
    @Column(length = 15,name = "telefono",unique = true)
    private String telefono;
    @Column(length = 100,name = "correo",unique = true)
    private String correo;



}
