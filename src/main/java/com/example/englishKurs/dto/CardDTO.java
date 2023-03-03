package com.example.englishKurs.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDTO {
    private Long id;
    private EnWordDTO enWord;
    private RuWordDTO ruWord;

    private Long rating;

}

