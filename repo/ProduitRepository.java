package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
