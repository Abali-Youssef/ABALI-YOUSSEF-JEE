package com.abaliyoussef.repositories;

import com.abaliyoussef.entities.Commentaire;
import com.abaliyoussef.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {

}
