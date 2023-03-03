package com.example.englishKurs.services;

import com.example.englishKurs.model.User;
import com.example.englishKurs.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        return this.userRepository.findById(id).get();
    }
}
