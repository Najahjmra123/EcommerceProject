package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.Panier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanierRepository extends JpaRepository<Panier,Long> {
}
