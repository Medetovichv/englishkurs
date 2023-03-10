package com.example.englishKurs.mappers;

import com.example.englishKurs.dto.UserDTO;
import com.example.englishKurs.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id")})
    UserDTO toDTO(User user);

}
