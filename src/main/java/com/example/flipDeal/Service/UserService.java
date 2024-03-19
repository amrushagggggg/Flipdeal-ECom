package com.example.flipDeal.Service;

import com.example.flipDeal.Mapper.UserMapper;
import com.example.flipDeal.Repositories.UserRepositories;
import com.example.flipDeal.Entity.User;
import com.example.flipDeal.dto.UserDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired

    UserRepositories userRepositories;



    public UserDto getUser(String email) {
        Optional<User> user = userRepositories.fetchByEmail(email);
        if (user == null) {
            throw new RuntimeException("Invalid User");
        }

        User fetchUsr = user.get();
        UserDto objUserdto  = UserMapper.convertToEntity();
        return  objUserdto;



    }

    public void addUser(UserDto user) {
        userRepositories.save(user);
    }
}
