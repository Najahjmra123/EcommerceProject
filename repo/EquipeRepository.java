package com.example.demo.repo;

import com.example.demo.modele.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
