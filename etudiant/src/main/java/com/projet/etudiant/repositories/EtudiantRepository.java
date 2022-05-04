package com.projet.etudiant.repositories;

import com.projet.etudiant.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findByNom(String nom);
    //List<Etudiant> findByMalade(boolean m);

    Page<Etudiant> findByNomLike(String m, Pageable pageable);
   /* List<Etudiant> findByMaladeAndScoreLessThan (boolean m,int score);
    List<Etudiant> findByMaladeIsTrueAndScoreLessThan (int score);
    List<Etudiant> findByNomLikeAndScoreGreaterThan(String nom,int score);*/
}
