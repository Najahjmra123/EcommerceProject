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
public class Entreprise extends  Audit {
    @Column(nullable = false)
    private String nom;
    @Column()
    private String historique;
    @Column(nullable = false)
    private String vision;
    @Column()
    private String mission;
    @OneToOne
    private Portfolio portfolio;
    @OneToMany
    private List<Equipe>equipes;
    @ManyToOne
    private Geolocalisation geolocalisation;
}
