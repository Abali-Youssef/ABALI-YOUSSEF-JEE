package com.abaliyoussef.repositories;

import com.abaliyoussef.entities.Commentaire;
import com.abaliyoussef.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference,Long> {

}
