package com.example.demo.modele.dto;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProduitDTO {
    private Long id;
    @Column(nullable=false)
    private String nom;
    private String descrition;
    private double prix;
    private int quantite;
    private String photo;

    @OneToMany(mappedBy = "produit")
    private List<LigneCommandeDTO> ligneCommandesDTO;

    @ManyToMany(mappedBy = "produits")
    private List<SousCategorieDTO> sousCategoriesDTO;

    @ManyToOne(fetch = FetchType.EAGER)
    //@JsonIgnoreProperties("prduits")
    private CatalogueProduitsDTO catalogueProduitsDTO;
    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private PromotionDTO promotionDTO;
}
