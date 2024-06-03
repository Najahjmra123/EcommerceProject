package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeRepository extends JpaRepository<LigneCommande,Long> {
}
