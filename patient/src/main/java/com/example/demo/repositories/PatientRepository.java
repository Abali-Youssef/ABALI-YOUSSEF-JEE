package com.example.demo.repositories;

import com.example.demo.entities.Patient;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String nom);
    List<Patient> findByMalade(boolean m);

    Page<Patient> findByNomLike(String m, Pageable pageable);
    List<Patient> findByMaladeAndScoreLessThan (boolean m,int score);
    List<Patient> findByMaladeIsTrueAndScoreLessThan (int score);
    List<Patient> findByNomLikeAndScoreGreaterThan(String nom,int score);
}
