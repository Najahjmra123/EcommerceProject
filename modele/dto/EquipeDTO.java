package com.example.demo.modele.dto;

import com.example.demo.modele.Members;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EquipeDTO {
    private Long id;
    private String nom;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<MembresDTO> membersDTO;
}
