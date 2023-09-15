package com.example.pruebatecnica.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.format.DateTimeParseException;

@RestControllerAdvice
public class ApiExceptionHandler {


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({
            EntidadNoEncontradaException.class
    })
    @ResponseBody
    public MensajeError notFound(HttpServletRequest request, Exception exception){
        return new MensajeError(exception, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler({
            DoctorNoEstaDisponibleException.class,
            ConsultorioOcupadoException.class,
            TurnoNoSePuedeCancelarOModificarException.class,
            PacienteExistenteException.class

    })
    @ResponseBody
    public MensajeError conflict(HttpServletRequest request, Exception exception){
        return new MensajeError(exception, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            ClinicaFueraDeServicioException.class,
            DateTimeParseException.class,
    })
    @ResponseBody
    public MensajeError badRequest(HttpServletRequest request, Exception exception){
        return new MensajeError(exception, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({
            Exception.class
    })
    @ResponseBody
    public MensajeError internal(HttpServletRequest request, Exception exception){
        return new MensajeError(exception, request.getRequestURI());
    }

}
