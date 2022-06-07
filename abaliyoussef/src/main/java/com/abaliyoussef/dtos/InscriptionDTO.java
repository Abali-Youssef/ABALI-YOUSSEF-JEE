package com.abaliyoussef.dtos;

import com.abaliyoussef.entities.Statut;
import lombok.Data;

import java.util.Date;

@Data

public class InscriptionDTO {

    private long id;
    private Date date;
    private Statut statut;
    private double prix;
   private SessionDTO sessionDTO;
}
