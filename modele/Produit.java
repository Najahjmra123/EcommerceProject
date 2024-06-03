package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Produit extends Audit {


    @Column(nullable=false)
    private String nom,descrition;

    private double prix;
    private int quantite;
    private String photo;

   @OneToMany(mappedBy = "produit")
    private List<LigneCommande> ligneCommandes;
    @ManyToOne
    @JoinColumn(name = "categorie_id", nullable = false)
    private Categorie categorie;

   // @ManyToOne(fetch = FetchType.EAGER)
    //@JsonIgnoreProperties("prduits")
   //
   // private CatalogueProduits catalogueProduits;
    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private Promotion promotion;
    



}
