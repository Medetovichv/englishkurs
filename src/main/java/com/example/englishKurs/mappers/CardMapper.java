package com.example.englishKurs.mappers;

import  com.example.englishKurs.dto.CardDTO;
import com.example.englishKurs.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CardMapper {

    CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);
    @Mappings({
            @Mapping(source = "id", target = "id")})
    CardDTO cardDTO (Card card);

}
