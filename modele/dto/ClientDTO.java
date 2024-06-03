package com.example.demo.modele.dto;

import com.example.demo.modele.Account;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private Long id;
    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private AccountDTO accountDTO;

}
