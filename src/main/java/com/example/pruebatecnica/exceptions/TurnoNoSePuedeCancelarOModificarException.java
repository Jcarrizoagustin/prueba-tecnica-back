package com.example.pruebatecnica.exceptions;

public class TurnoNoSePuedeCancelarOModificarException extends RuntimeException{
    public TurnoNoSePuedeCancelarOModificarException(String detail){
        super(detail);
    }
}
