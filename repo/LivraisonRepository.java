package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivraisonRepository extends JpaRepository<Livraison,Long> {
}