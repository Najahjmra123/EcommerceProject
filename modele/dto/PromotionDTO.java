package com.example.demo.modele.dto;

import com.example.demo.modele.Produit;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PromotionDTO {
    private Long id;
    @Column
    private String nom;
    @Column
    private Number prixPromo;
    @Column
    private double discountPercentage;
    @Column
    private LocalDateTime startDate;
    @Column
    private LocalDateTime endDate;

    @OneToMany(fetch = FetchType.EAGER)
    private List<ProduitDTO> produitListDTO;
}
