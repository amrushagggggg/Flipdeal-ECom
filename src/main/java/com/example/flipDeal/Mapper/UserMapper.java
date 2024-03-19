package com.example.flipDeal.Mapper;

import com.example.flipDeal.Entity.User;
import com.example.flipDeal.dto.UserDto;
import org.modelmapper.ModelMapper;


public   class UserMapper {
   private static ModelMapper   modelMapper = new ModelMapper();
   public static User convertToEntity(UserDto user)
   {


       User userEntity = modelMapper.map(UserDto.class, User.class);
       return userEntity;

   }

}
