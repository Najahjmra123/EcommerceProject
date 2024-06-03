package com.example.demo.modele.dto;

import com.example.demo.modele.Panier;
import com.example.demo.modele.Produit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PanierProduitDTO {
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdt;
    @Column(nullable = false)
    private LocalDateTime updatedt;
    private Number prix;
    private Number quantite;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("panierProduit")
    @JoinColumn(name = "produit_id")
    private ProduitDTO produitDTO;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("panierProduit")
    @JoinColumn(name = "panier_id")
    private PanierDTO panierDTO;

}
