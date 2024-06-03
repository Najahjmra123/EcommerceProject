package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatistiqueRepository extends JpaRepository<Statistique,Long> {
}
