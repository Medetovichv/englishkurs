package com.example.englishKurs.controllers;

import com.example.englishKurs.dto.EnWordDTO;
import com.example.englishKurs.mappers.EnWordMapper;
import com.example.englishKurs.model.EnWord;
import com.example.englishKurs.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;
    private final EnWordMapper enWordMapper;

    @GetMapping("/en-words/{id}")
    public EnWordDTO main(@PathVariable Long id){
        EnWord enWord = enWordService.getEnWord(id);
        return enWordMapper.toEnWordDTO(enWord);
    }

}
