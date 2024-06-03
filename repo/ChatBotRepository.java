package com.example.demo.repo;

import com.example.demo.modele.Admin;
import com.example.demo.modele.ChatBot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatBotRepository extends JpaRepository<ChatBot,Long> {
}
