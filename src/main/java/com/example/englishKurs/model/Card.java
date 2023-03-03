package com.example.englishKurs.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "cards")
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
//    @JoinColumn(name = "en_word_id")
    private EnWord enWord;
    @ManyToOne
//    @JoinColumn(name = "ru_word_id")
    private RuWord ruWord;

    private Long rating;


}
