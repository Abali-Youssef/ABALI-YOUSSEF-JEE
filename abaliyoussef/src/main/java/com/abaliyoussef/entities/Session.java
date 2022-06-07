package com.abaliyoussef.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.jws.WebParam;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    @ManyToOne
    private Salle sale;
    @ManyToOne
    private Moderateur moderateur;

    @OneToMany(mappedBy = "session",fetch = FetchType.LAZY)
    List<Conference> conferences= new ArrayList<>();
    @OneToMany(mappedBy = "session",fetch = FetchType.LAZY)
    List<Inscription> inscriptions= new ArrayList<>();
}
