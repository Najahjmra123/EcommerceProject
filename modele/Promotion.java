package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Promotion extends Audit {
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
    private List<Produit> produitList;
}
