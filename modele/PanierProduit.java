package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PanierProduit extends Audit{
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdt;
    @Column(nullable = false)
    private LocalDateTime updatedt;
    private Number prix;
    private Number quantite;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("panierProduit")
    @JoinColumn(name = "produit_id")
    private Produit produit;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("panierProduit")
    @JoinColumn(name = "panier_id")
    private Panier panier;


}
