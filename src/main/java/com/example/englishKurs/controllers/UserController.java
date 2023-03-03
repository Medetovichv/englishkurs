package com.example.englishKurs.controllers;

import com.example.englishKurs.dto.UserDTO;
import com.example.englishKurs.mappers.UserMapper;
import com.example.englishKurs.model.User;
import com.example.englishKurs.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/users/{id}")
    public UserDTO main(@PathVariable Long id){
        User user = userService.getUser(id);
        return userMapper.INSTANCE.toDTO(user);
    }

}
