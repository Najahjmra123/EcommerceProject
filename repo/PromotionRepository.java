package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion,Long> {
}
