package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LigneCommande extends Audit {
    @Column(nullable = false)
    private String quantite;
    @Column(nullable = false)
    private Number prixunitair;
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JsonIgnoreProperties("ligneCommande")
    private Commande commande;
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JsonIgnoreProperties("ligneCommande")
    private Produit produit;
}
