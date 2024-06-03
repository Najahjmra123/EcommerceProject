package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembresRepository extends JpaRepository<Members,Long> {
}
