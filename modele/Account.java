package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Account extends Audit {

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
   private Client client;
    @OneToOne
    private Employer employer;
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reclamation> reclamations;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "panier_id", referencedColumnName = "id")
    private Panier panier;


    public Account() {

    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotpass() {
        return motpass;
    }

    public void setMotpass(String motpass) {
        this.motpass = motpass;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }




}
