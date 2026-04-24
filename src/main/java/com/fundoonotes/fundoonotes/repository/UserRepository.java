package com.fundoonotes.fundoonotes.repository;

import com.fundoonotes.fundoonotes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}