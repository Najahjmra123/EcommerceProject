package com.example.demo.modele.dto;

import com.example.demo.modele.Commande;
import com.example.demo.modele.Produit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LigneCommandeDTO {
    private Long id;
    @Column(nullable = false)
    private String quantite;
    @Column(nullable = false)
    private Number prixunitair;
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JsonIgnoreProperties("ligneCommande")
    private CommandeDTO commandeDTO;
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JsonIgnoreProperties("ligneCommande")
    private ProduitDTO produitDTO;
}
