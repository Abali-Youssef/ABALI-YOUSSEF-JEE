package com.abaliyoussef.repositories;

import com.abaliyoussef.entities.Salle;
import com.abaliyoussef.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle,Long> {

}
