package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.PanierProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanierProduitRepository extends JpaRepository<PanierProduit,Long> {
}
