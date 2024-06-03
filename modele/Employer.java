package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employer")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employer extends User{
    private Double salaire;
    private Date dateDebutTravail;
    private Date dateFinTravail;
    @OneToOne
    private Account account;
}
