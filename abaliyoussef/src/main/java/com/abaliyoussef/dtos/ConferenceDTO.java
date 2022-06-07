package com.abaliyoussef.dtos;


import lombok.Data;

import java.util.Date;


@Data

public class ConferenceDTO {
    private Long id;
    private String titre;
    private Date date;
    private String heureDebut;
    private String getHeureFin;
    private String description;

}
