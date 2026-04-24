package com.fundoonotes.fundoonotes.service;

import com.fundoonotes.fundoonotes.dto.LoginDTO;
import com.fundoonotes.fundoonotes.dto.UserDTO;
import com.fundoonotes.fundoonotes.entity.User;
import com.fundoonotes.fundoonotes.repository.UserRepository;
import com.fundoonotes.fundoonotes.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private JwtUtil jwtUtil;

    public String login(LoginDTO dto) {

        User user = userRepository.findByEmail(dto.getEmail());

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        if (!user.getPassword().equals(dto.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        // Return JWT instead of user
        return jwtUtil.generateToken(user.getEmail());
    }

}