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

public class SousCategorie extends Audit{
    @Column
    private String nom;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("SousCategoris")
    private Categorie categorie;

    @ManyToMany
    private List<Produit> produits;
}
