package com.example.demo.modele.dto;

import com.example.demo.modele.SousCategorie;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class CategorieDTO {
    private Long id;
    @Column

    private String nom;
    @OneToMany(mappedBy = "categorie")
    private List<SousCategorieDTO> sousCategoriesDto;

}
