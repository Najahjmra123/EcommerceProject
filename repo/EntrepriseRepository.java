package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise,Long> {
}
