package com.example.pruebatecnica.exceptions;

public class ClinicaFueraDeServicioException extends RuntimeException{

    public ClinicaFueraDeServicioException(String detail){
        super(detail);
    }
}
