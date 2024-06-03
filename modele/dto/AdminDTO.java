package com.example.demo.modele.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AdminDTO {
    private Long id;
    @Column
    private String pseudo;
}
