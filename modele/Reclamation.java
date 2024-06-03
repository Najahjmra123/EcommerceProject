package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "réclamation")

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Reclamation  extends Audit{
    private String sujet;
    private String description;
    private Date dateCreation;
    private String status;
    @ManyToOne
    private Account account;
}
