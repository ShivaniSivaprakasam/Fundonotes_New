package com.fundoonotes.fundoonotes.service;

import com.fundoonotes.fundoonotes.dto.LoginDTO;
import com.fundoonotes.fundoonotes.dto.UserDTO;
import com.fundoonotes.fundoonotes.entity.User;
import com.fundoonotes.fundoonotes.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(UserDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        return userRepository.save(user);
    }
    public User login(LoginDTO dto) {

        // Find user by email
        User user = userRepository.findByEmail(dto.getEmail());

        // If user not found
        if (user == null) {
            throw new RuntimeException("User not found");
        }

        // Check password
        if (!user.getPassword().equals(dto.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        return user;
    }
}