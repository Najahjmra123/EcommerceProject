package com.example.demo.modele.dto;

import jakarta.persistence.Column;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatBotDTO {
    private Long id;
    @Column
    private String question;
    @Column
    private String reponse;
}
