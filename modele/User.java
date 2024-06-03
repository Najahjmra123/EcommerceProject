package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
@Inheritance(strategy= InheritanceType.JOINED)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User extends Audit{


    @JsonProperty("firstname")
    private String nom;
    @JsonProperty("lastname")
    private String prenom;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;

    @JsonProperty("telephone")
    private String telephone;

    @JsonProperty("role")
    private String role;

    @JsonProperty("adresse")
    private String adresse;
    @Enumerated(EnumType.STRING)
    private TypeUser typeUser;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Logo logo;

}
