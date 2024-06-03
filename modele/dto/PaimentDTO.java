package com.example.demo.modele.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaimentDTO {
    private Long id;
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
    private CommandeDTO commandeDTO;


}
