package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
