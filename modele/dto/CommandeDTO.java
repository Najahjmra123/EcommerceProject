package com.example.demo.modele.dto;

import com.example.demo.modele.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommandeDTO {
    private Long id;
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
    private List<LigneCommandeDTO> ligneCommandesDTO;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JsonIgnoreProperties("commandes")
    private UserDTO userDTO;

    @OneToOne(mappedBy = "commande",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("commande")
    private LivraisonDTO livraisonDTO;


}
