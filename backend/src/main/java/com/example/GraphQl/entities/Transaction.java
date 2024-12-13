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
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID unique pour chaque transaction

    private double montant; // Montant de la transaction

    private LocalDate date; // Date de la transaction

    @Enumerated(EnumType.STRING)
    private TypeTransaction type; // Type de transaction (DEPOT, RETRAIT)

    @ManyToOne // Relation ManyToOne avec Compte
    @JoinColumn(name = "compte_id", nullable = false) // Clé étrangère vers Compte
    private Compte compte; // Référence au compte associé à la transaction
}