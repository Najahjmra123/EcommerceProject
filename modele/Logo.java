package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "logo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Logo extends Audit {
    private int maxtaille;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
