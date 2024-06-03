package com.example.demo.modele.dto;

import com.example.demo.modele.Entreprise;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.io.File;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioDTO {
    private Long id;
    @Column
    private String projet;
    @Column
    private String descpription;
    @Column
    private File img;
    @OneToOne
    private EntrepriseDTO entrepriseDTO;

}
