package com.abaliyoussef.repositories;

import com.abaliyoussef.entities.Participant;
import com.abaliyoussef.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant,Long> {

}
