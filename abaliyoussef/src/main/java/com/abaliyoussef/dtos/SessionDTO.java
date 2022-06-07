package com.abaliyoussef.dtos;

import lombok.Data;


@Data

public class SessionDTO {
    private long id;
    private String nom;
    private SalleDTO sale;
    private ModerateurDTO moderateur;
}
