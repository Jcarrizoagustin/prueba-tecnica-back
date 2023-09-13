package com.example.pruebatecnica.mappers.turno;

import com.example.pruebatecnica.dtos.turno.TurnoRequestDTO;
import com.example.pruebatecnica.model.Turno;


import java.time.LocalDate;
import java.time.LocalTime;



public class TurnoMapper {




    public Turno turnoRequestDTOToTurno(TurnoRequestDTO dto){
        Turno turno = new Turno();

        LocalDate dia = LocalDate.parse(dto.getDia());
        LocalTime hora = LocalTime.parse(dto.getHora());

        turno.setDia(dia);
        turno.setHora(hora);

        return turno;
    }
}
