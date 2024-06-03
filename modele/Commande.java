package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})


public class Commande extends  Audit {
@Column
    private Number montant;
@Column
    private String statut;
    @Enumerated
    private TypeEtat etat;
    @Column(nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateCreation=LocalDate.now();
    private String adresseLivraison;
    @OneToMany(mappedBy = "commande",cascade = CascadeType.ALL)
    private List<LigneCommande> ligneCommandes;


    @OneToOne(mappedBy = "commande",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("commande")
    private Livraison livraison;






}
