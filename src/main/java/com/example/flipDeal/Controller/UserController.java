package com.example.flipDeal.Controller;

import com.example.flipDeal.Service.UserService;
import com.example.flipDeal.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/email/{email}")
    public User getUser(@PathVariable String email) {

        User user = userService.getUser(email);
        return user;
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
}
