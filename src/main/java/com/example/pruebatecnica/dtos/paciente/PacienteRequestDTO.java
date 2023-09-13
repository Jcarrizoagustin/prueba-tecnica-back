package com.example.pruebatecnica.dtos.paciente;

import lombok.Data;

@Data
public class PacienteRequestDTO {

    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private String telefono;
    private String fechaNacimiento;
}
