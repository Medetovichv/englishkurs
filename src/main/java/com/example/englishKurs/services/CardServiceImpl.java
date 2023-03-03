package com.example.englishKurs.services;

import com.example.englishKurs.model.Card;
import com.example.englishKurs.repositories.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{
    private final CardRepository cardRepository;


    @Override
    public Card getCard(Long id) {
        return cardRepository.findById(id).get();
    }
}
