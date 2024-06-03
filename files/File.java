package com.example.demo.files;

import com.example.demo.modele.Audit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class File extends Audit {
    @Column
    private  String nom;
    @Column
    private LocalDateTime dateCreation;
    @Column
    private byte[] data;

}
