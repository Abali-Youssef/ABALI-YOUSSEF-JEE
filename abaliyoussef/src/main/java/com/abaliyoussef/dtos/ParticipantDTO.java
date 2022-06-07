package com.abaliyoussef.dtos;

import com.abaliyoussef.entities.Genre;
import lombok.Data;

@Data
public class ParticipantDTO {

    private long id;
    private String nom;
    private String email;
    private String photo;
    private Genre genre;

}
