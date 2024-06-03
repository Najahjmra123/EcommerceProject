package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.Paiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaimentRepository extends JpaRepository<Paiment,Long> {
}
