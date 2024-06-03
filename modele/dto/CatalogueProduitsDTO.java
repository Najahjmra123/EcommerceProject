package com.example.demo.modele.dto;

import com.example.demo.modele.Produit;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class CatalogueProduitsDTO {
    private Long id;

    @OneToMany(mappedBy = "catalogueProduits", cascade = CascadeType.ALL)
    private List<ProduitDTO> produitsDto;
}
