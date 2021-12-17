package com.example.pazyniak_spring.controller;

import com.example.pazyniak_spring.domain.User;
import com.example.pazyniak_spring.dto.UserDto;
import com.example.pazyniak_spring.mapper.AbstractMapper;
import com.example.pazyniak_spring.mapper.UserMapper;
import com.example.pazyniak_spring.service.AbstractService;
import com.example.pazyniak_spring.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/user")
@RestController
@AllArgsConstructor

public class UserController extends AbstractController<User, UserDto, Integer>{
    @Autowired
    protected UserService userService;
    @Autowired
    protected UserMapper userMapper;

    @Override
    protected AbstractService<User, Integer, UserDto> getService() {
        return userService;
    }

    @Override
    protected AbstractMapper<User, UserDto> getMapper() {
        return userMapper;
    }
}
