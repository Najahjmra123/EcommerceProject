package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
