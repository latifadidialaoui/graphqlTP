package com.example.GraphQl.repositories;

import com.example.GraphQl.entities.Compte;
import com.example.GraphQl.entities.Transaction;
import com.example.GraphQl.entities.TypeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // Méthode pour récupérer la somme des montants par type de transaction
    @Query("SELECT SUM(t.montant) FROM Transaction t WHERE t.type = :type")
    double sumByType(@Param("type") TypeTransaction type);

    List<Transaction> findByCompte(Compte compte);


}
