package com.example.englishKurs.mappers;

import com.example.englishKurs.dto.EnWordDTO;
import com.example.englishKurs.dto.UserDTO;
import com.example.englishKurs.model.EnWord;
import com.example.englishKurs.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EnWordMapper {

    EnWordMapper INSTANCE = Mappers.getMapper(EnWordMapper.class);

  EnWordDTO toEnWordDTO(EnWord enWord);

}
