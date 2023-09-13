package com.example.pruebatecnica.services;

import com.example.pruebatecnica.exceptions.EntidadNoEncontradaException;
import com.example.pruebatecnica.model.Doctor;
import com.example.pruebatecnica.model.Especialidad;
import com.example.pruebatecnica.repositories.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    private final EspecialidadService especialidadService;

    public DoctorService(DoctorRepository doctorRepository, EspecialidadService especialidadService){
        this.doctorRepository = doctorRepository;
        this.especialidadService = especialidadService;
    }

    public List<Doctor> listado(){
        return doctorRepository.findAll();
    }


    public List<Doctor> listadoPorEspecialidad(String especialidad){
        Optional<Especialidad> especialidad1 = especialidadService.buscarPorDescripcion(especialidad);
        if(especialidad1.isEmpty()){
            throw new EntidadNoEncontradaException("Especialidad no encontrada");
        }
        return doctorRepository.findAllByEspecialidad(especialidad1.get());
    }

    public Doctor obtenerDoctorPorId(Long id){
        Optional<Doctor> doctor = doctorRepository.findById(id);
        if(doctor.isPresent()){
            return doctor.get();
        }else{
            throw new EntidadNoEncontradaException("Doctor no encontrado");
        }
    }

}
