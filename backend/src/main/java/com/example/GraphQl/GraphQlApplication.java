package com.example.GraphQl;

import com.example.GraphQl.entities.Compte;
import com.example.GraphQl.entities.TypeCompte;
import com.example.GraphQl.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;

@SpringBootApplication
public class GraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(CompteRepository compteRepository) {
		return args -> {

			compteRepository.save(new Compte(null, 1500.0, LocalDate.now(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 2000.0, LocalDate.now(), TypeCompte.EPARGNE));

		};
	}
}