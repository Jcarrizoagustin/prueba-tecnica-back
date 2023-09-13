package com.example.pruebatecnica.dtos.turno;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TurnoRequestDTO {

    private Long doctor_id;
    private Long paciente_id;
    private Long consultorio_id;
    private String dia;
    private String hora;
}
