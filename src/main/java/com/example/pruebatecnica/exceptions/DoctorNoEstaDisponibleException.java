package com.example.pruebatecnica.exceptions;

public class DoctorNoEstaDisponibleException extends RuntimeException{

    public DoctorNoEstaDisponibleException(String detail){
        super(detail);
    }
}
