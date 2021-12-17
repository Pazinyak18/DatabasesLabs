package com.example.pazyniak_spring.mapper;

import com.example.pazyniak_spring.domain.User;
import com.example.pazyniak_spring.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends AbstractMapper<User, UserDto>{
    @Override
    public UserDto mapObjectToDto(User user) {
        if (user == null)
        return null;
        UserDto.UserDtoBuilder userDtoBuilder = UserDto.builder();
        userDtoBuilder.id(user.getId());
        userDtoBuilder.name(user.getName());
        userDtoBuilder.email(user.getEmail());
        userDtoBuilder.commentsNumber(user.getComments().size());
        userDtoBuilder.factsNumber(user.getFacts().size());
        return userDtoBuilder.build();
    }
}
