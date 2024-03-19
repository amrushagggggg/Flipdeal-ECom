package com.example.flipDeal.Repositories;

import com.example.flipDeal.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepositories extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);

}
