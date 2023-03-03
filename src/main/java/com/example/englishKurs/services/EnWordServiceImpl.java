package com.example.englishKurs.services;

import com.example.englishKurs.model.EnWord;
import com.example.englishKurs.repositories.EnWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EnWordServiceImpl implements EnWordService{
    private  final EnWordRepository enWordRepository;


    @Override
    public EnWord getEnWord(Long id) {
        return enWordRepository.findById(id).get();
    }
}
