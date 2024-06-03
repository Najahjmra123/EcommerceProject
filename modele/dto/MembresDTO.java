package com.example.demo.modele.dto;

import com.example.demo.modele.Entreprise;
import com.example.demo.modele.Equipe;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MembresDTO {
    private Long id;
    @Column
    private String competence;
    @Column
    private String experience;
    @ManyToMany(mappedBy = "members")
    private List<EquipeDTO> equipesDTO;
    @ManyToOne()
    private EntrepriseDTO entrepriseDTO;
}
