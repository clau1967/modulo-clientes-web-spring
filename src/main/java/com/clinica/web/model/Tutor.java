package com.clinica.web.model;

import jakarta.persistence.*;
import lombok.Data; 
import lombok.NoArgsConstructor; 
import lombok.AllArgsConstructor; 

@Entity
@Table(name = "tutor")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Tutor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTutor; 

    private String nombre;
    private String apellido;
    private String identificacion;
    private String telefono; 
}