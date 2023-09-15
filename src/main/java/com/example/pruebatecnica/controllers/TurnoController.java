package com.example.pruebatecnica.controllers;
import com.example.pruebatecnica.dtos.turno.Mensaje;
import com.example.pruebatecnica.dtos.turno.TurnoRequestDTO;
import com.example.pruebatecnica.model.Turno;
import com.example.pruebatecnica.services.TurnoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api/v1/turnos")
public class TurnoController {

    private final TurnoService turnoService;

    public TurnoController(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    @GetMapping
    public ResponseEntity<List<Turno>> listadoTurnos(){
        return ResponseEntity.ok(turnoService.listadoTurnosPendientes());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Turno>> listadoTodosLosTurnos(){
        return ResponseEntity.ok(turnoService.listado());
    }

    @PostMapping
    public ResponseEntity<Turno> listadoTurnos(@RequestBody TurnoRequestDTO dto){
        return ResponseEntity.ok(turnoService.nuevoTurno(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Turno> modificarTurno(@PathVariable Long id,@RequestBody TurnoRequestDTO dto){
        return ResponseEntity.ok(turnoService.modificarTurno(dto,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity cancelarTurno(@PathVariable Long id){
        turnoService.eliminarTurno(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/")
    public ResponseEntity<List<Turno>> listadoDeTurnosPorPaciente(@RequestParam Long pacienteId){
        return ResponseEntity.ok(turnoService.listadoTurnosPorIDPaciente(pacienteId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turno> obtenerTurnoPorId(@PathVariable Long id){
        return ResponseEntity.ok(turnoService.obtenerTurnoPorId(id));
    }
}
