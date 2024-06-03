package com.example.demo.modele.dto;

import com.example.demo.modele.Members;
import com.example.demo.modele.Portfolio;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntrepriseDTO {
    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column()
    private String historique;
    @Column(nullable = false)
    private String vision;
    @Column()
    private String mission;
    @OneToOne
    private PortfolioDTO portfolioDTO;
    @OneToMany
    private List<MembresDTO> membresListDTO;
}
