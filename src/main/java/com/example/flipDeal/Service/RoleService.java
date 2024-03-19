package com.example.flipDeal.Service;


import com.example.flipDeal.Repositories.RoleRepositories;
import com.example.flipDeal.Entity.Role;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {
    RoleRepositories roleRepositories;
    public Role getRole(String name) {
        Optional<Role> user = roleRepositories.findByName(name);
        if (user == null) {
            throw new RuntimeException("Invalid User");
        }

        Role fetchRole = user.get();
        return fetchRole;


    }

    public void addUser(Role role) {
        roleRepositories.save(role);
    }
}

