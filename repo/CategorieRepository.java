package com.example.demo.repo;

import com.example.demo.modele.Admin;

import com.example.demo.modele.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
