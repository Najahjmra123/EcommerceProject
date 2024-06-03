package com.example.demo.modele.dto;

import com.example.demo.modele.Client;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class AccountDTO {
    private Long id;
    @Column(nullable=false)
    private String nom;
    @Column(nullable=false)
    private String prenom;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String motpass;
    @Column
    private String telephone;
    @Column
    private String typeAccount;
    @Column
    private String adresse;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private ClientDTO clientDTO;
}
