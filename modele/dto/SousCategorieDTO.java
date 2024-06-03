package com.example.demo.modele.dto;

import com.example.demo.modele.Categorie;
import com.example.demo.modele.Produit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SousCategorieDTO {
    private Long id;
    @Column
    private String nom;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("SousCategoris")
    private CategorieDTO categorieDTO;

    @ManyToMany
    private List<ProduitDTO> produitsDTO;
}
