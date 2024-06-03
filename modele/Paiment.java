package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Paiment extends Audit {
    @Column
    private String etat;
    @Column
    private String adress;
    @Column
    private LocalDateTime date;
    @Column
    private Number mantont;

    private String methodePaiment;
    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("paiment")
    private Commande commande;



}
