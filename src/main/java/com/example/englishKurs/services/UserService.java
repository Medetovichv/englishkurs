package com.example.englishKurs.services;

import com.example.englishKurs.model.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User getUser(Long id);
}
