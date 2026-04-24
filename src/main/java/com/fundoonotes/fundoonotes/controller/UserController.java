package com.fundoonotes.fundoonotes.controller;

import com.fundoonotes.fundoonotes.dto.LoginDTO;
import com.fundoonotes.fundoonotes.dto.UserDTO;
import com.fundoonotes.fundoonotes.entity.User;
import com.fundoonotes.fundoonotes.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")   // Base URL
public class UserController {

    private final UserService userService;

    // Constructor Injection (Best Practice)
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ==============================
    // ✅ REGISTER API (UC4)
    // ==============================
    @PostMapping("/register")
    public User register(@RequestBody UserDTO dto) {
        return userService.register(dto);
    }

    // ==============================
    // ✅ LOGIN API (UC5)
    // ==============================
    @PostMapping("/login")
    public User login(@RequestBody LoginDTO dto) {
        return userService.login(dto);
    }
}