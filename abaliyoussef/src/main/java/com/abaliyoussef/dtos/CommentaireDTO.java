package com.abaliyoussef.dtos;

import lombok.Data;

import java.util.Date;


@Data

public class CommentaireDTO {

    private long id;
    private Date date;
    private String contenu;
    private int nbLike;
    private ParticipantDTO participantDTO;
}
