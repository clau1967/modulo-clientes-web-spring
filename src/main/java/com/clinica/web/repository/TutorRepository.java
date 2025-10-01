package com.clinica.web.repository;

import com.clinica.web.model.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {
    // Hereda todas las operaciones CRUD
}