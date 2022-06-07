package com.abaliyoussef.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private Date date;
    private String heureDebut;
    private String getHeureFin;
    private String description;
    @ManyToOne
    private Participant speaker;
    @ManyToOne
    private Session session;
    @OneToMany(mappedBy = "conference",fetch = FetchType.LAZY)
    List<Commentaire> commentaires= new ArrayList<>();
}
