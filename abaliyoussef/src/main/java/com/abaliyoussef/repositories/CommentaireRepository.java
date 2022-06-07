package com.abaliyoussef.repositories;

import com.abaliyoussef.entities.Commentaire;
import com.abaliyoussef.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepository extends JpaRepository<Commentaire,Long> {

}
