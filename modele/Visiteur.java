package com.example.demo.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Visiteur extends User{
    @Column
    String pseudo;
}
