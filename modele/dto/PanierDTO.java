package com.example.demo.modele.dto;

import com.example.demo.modele.PanierProduit;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PanierDTO {
    private Long d;
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdt;
    @Column(nullable = false)
    private LocalDateTime updatedt;
    private Number total ;
    @OneToMany(mappedBy = "panier",cascade = CascadeType.ALL)
    private List<PanierProduitDTO> panierProduitDTOList;
}
