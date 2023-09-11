package com.example.pruebatecnica.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "paciente")
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

    @Column(length = 8,nullable = false,name = "dni")
    private String dni;
    @Column(length = 15,name = "telefono",unique = true)
    private String telefono;
    @Column(length = 100,name = "correo")
    private String correo;

    //private List<Turno> turnos;

}
