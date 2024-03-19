package com.example.flipDeal.Repositories;

import com.example.flipDeal.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositories extends JpaRepository<User,Integer> {
    Optional<User> fetchByEmail(String email);
}
