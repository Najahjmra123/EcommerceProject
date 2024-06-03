package com.example.demo.modele.dto;

import jakarta.persistence.Column;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatistiqueDTO {
    private Long id;
    @Column
    private Number totaleVent;
}
