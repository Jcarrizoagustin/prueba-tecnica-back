package com.example.pruebatecnica.model;

import jakarta.persistence.*;
import lombok.Data;

import javax.print.attribute.standard.MediaSize;
import java.util.List;


public class Agenda {


    private Long id;



    private List<HorarioAtencion> horarios;


    private Doctor doctor;
}
