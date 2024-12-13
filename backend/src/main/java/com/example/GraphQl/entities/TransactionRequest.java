package com.example.GraphQl.entities;

import java.time.LocalDate;

public class TransactionRequest {
    private Long compteId; // ID du compte associé à la transaction
    private double montant; // Montant de la transaction
    private LocalDate date; // Date de la transaction

    // Constructeurs
    public TransactionRequest() {}

    public TransactionRequest(Long compteId, double montant, LocalDate date) {
        this.compteId = compteId;
        this.montant = montant;
        this.date = date;
    }

    // Getters et Setters
    public Long getCompteId() {
        return compteId;
    }

    public void setCompteId(Long compteId) {
        this.compteId = compteId;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}