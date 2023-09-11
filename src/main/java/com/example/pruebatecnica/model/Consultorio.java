package com.example.pruebatecnica.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "consultorio")
public class Consultorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 15)
    private String descripcion;
}
