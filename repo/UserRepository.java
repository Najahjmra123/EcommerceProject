package com.example.demo.repo;

import com.example.demo.modele.ChatBot;
import com.example.demo.modele.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User>findByEmail(String email);


}
