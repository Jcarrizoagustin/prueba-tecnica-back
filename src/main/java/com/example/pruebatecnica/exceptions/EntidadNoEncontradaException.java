package com.example.pruebatecnica.exceptions;

public class EntidadNoEncontradaException extends RuntimeException{
    public EntidadNoEncontradaException(String detail){
        super(detail);
    }
}
