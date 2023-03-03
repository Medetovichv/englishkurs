package com.example.englishKurs.controllers;

import com.example.englishKurs.dto.CardDTO;
import com.example.englishKurs.mappers.CardMapper;
import com.example.englishKurs.model.Card;
import com.example.englishKurs.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping("/cards/{id}")
    public CardDTO getCardById(@PathVariable Long id){
        Card card = cardService.getCard(id);
        return cardMapper.cardDTO(card);
    }
}
