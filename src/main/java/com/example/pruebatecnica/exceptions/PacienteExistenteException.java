package com.example.pruebatecnica.exceptions;

public class PacienteExistenteException extends RuntimeException{

    public PacienteExistenteException(String detail){
        super(detail);
    }
}
