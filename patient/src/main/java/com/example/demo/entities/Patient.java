package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size(min=4,max=10)
    private String nom;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private Date dateNaissance;
    private boolean malade;
    @DecimalMax("20")
    private int score;


}