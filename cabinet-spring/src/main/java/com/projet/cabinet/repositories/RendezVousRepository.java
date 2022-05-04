package com.projet.cabinet.repositories;

import com.projet.cabinet.entities.Patient;
import com.projet.cabinet.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long>
{

}
