package com.clinica.web.controller;

import com.clinica.web.model.Tutor;
import com.clinica.web.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tutores")
public class TutorController {

    private final TutorRepository tutorRepository;

    @Autowired
    public TutorController(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    // Endpoint: Crear un nuevo Tutor (CREATE)
    @PostMapping
    public ResponseEntity<Tutor> crearTutor(@RequestBody Tutor tutor) {
        Tutor nuevoTutor = tutorRepository.save(tutor);
        return new ResponseEntity<>(nuevoTutor, HttpStatus.CREATED);
    }
    
    // Endpoint: Consultar todos los Tutores (READ ALL)
    @GetMapping
    public ResponseEntity<List<Tutor>> obtenerTodos() {
        return new ResponseEntity<>(tutorRepository.findAll(), HttpStatus.OK);
    }

    // Endpoint: Eliminar un Tutor (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTutor(@PathVariable Long id) {
        if (!tutorRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        tutorRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}