package com.example.flipDeal.Controller;

import com.example.flipDeal.Service.RoleService;
import com.example.flipDeal.Entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;
    @GetMapping("/role/{role}")
    public Role getRole(@PathVariable  String name)
    {
      Role role =   roleService.getRole(name);
      return role;
    }

    @PostMapping("/addrole")
    public void addRole(@RequestBody Role role)
    {
        roleService.addUser(role);
    }
}
