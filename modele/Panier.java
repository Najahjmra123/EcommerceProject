package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
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
public class Panier extends Audit {
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdt;
    @Column(nullable = false)
    private LocalDateTime updatedt;
    private Number total ;
    @OneToMany(mappedBy = "panier",cascade = CascadeType.ALL)
    private List<PanierProduit> panierProduit;

    @OneToOne(mappedBy = "panier")

    private Account account;


}
