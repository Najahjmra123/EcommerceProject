package com.example.demo.modele.dto;

import com.example.demo.modele.Commande;
import com.example.demo.modele.TypeUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private Long id;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @Column
    private  String pwed;
    @JsonProperty("telephone")
    private String telephone;
    @JsonProperty("role")
    @Enumerated(EnumType.STRING)
    private TypeUser role;

    @JsonProperty("adresse")
    private String adresse;
    @Enumerated(EnumType.STRING)
    private TypeUser typeUser;
    //@OneToMany
    //private List<Commande> commandes;
}
