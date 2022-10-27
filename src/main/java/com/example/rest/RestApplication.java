package com.example.rest;

import com.example.rest.entities.Client;
import com.example.rest.entities.Compte;
import com.example.rest.entities.TypeCompte;
import com.example.rest.repositories.ClientRepository;
import com.example.rest.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository, RepositoryRestConfiguration restConfiguration,
                            ClientRepository clientRepository){
        return args -> {
            restConfiguration.exposeIdsFor(Compte.class);
            Client c1=clientRepository.save(new Client(null,"Hassan",null));
            Client c2=clientRepository.save(new Client(null,"Mohamed",null));
            compteRepository.save(new Compte(null,Math.random()*9000,new Date(), TypeCompte.EPARGNE,c1));
            compteRepository.save(new Compte(null,Math.random()*9000,new Date(), TypeCompte.COURANT,c2));
            compteRepository.save(new Compte(null,Math.random()*9000,new Date(), TypeCompte.EPARGNE,c1));
            compteRepository.findAll().forEach(c -> {
                System.out.println(c.getSolde());
            });

        };
    }
}
