package com.fundoonotes.fundoonotes.controller;

import com.fundoonotes.fundoonotes.dto.UserDTO;
import com.fundoonotes.fundoonotes.entity.User;
import com.fundoonotes.fundoonotes.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // API to register user
    @PostMapping("/register")
    public User register(@RequestBody UserDTO dto) {
        return userService.register(dto);
    }
}