package com.example.getmesocialservice.services;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

        @Autowired
        private UserRepository userRepository;

        public User getUsers() {
                return userRepository.getUsers();
        }
}
