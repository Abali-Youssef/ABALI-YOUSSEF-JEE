package com.abaliyoussef.repositories;

import com.abaliyoussef.entities.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
     /*Etudiant findByNom(String nom);
    //List<Etudiant> findByMalade(boolean m);

    Page<Etudiant> findByNomLike(String m, Pageable pageable);
   List<Etudiant> findByMaladeAndScoreLessThan (boolean m,int score);
    List<Etudiant> findByMaladeIsTrueAndScoreLessThan (int score);
    List<Etudiant> findByNomLikeAndScoreGreaterThan(String nom,int score);*/
}
