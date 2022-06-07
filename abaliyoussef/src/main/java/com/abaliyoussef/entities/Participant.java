package com.abaliyoussef.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "statut",length = 50)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Participant {
    @Id
    private long id;
    private String nom;
    private String email;
    private String photo;
    private Genre genre;
    @OneToMany(mappedBy = "invite")
    private List<Inscription> inscriptions;
    @OneToMany(mappedBy = "speaker")
    private List<Conference> conferences;
    @OneToMany(mappedBy = "participant",fetch = FetchType.LAZY)
    List<Commentaire> commentaires= new ArrayList<>();
    @OneToMany(mappedBy = "moderateur",fetch = FetchType.LAZY)
    List<Session> sessions= new ArrayList<>();
}
