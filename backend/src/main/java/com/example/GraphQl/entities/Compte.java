package com.example.GraphQl.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte{
    @Id
    @GeneratedValue(strategy=GenerationType. IDENTITY)
    private Long id;
    private double solde;

    private LocalDate dateCreation; // Assurez-vous que c'est LocalDate
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
}