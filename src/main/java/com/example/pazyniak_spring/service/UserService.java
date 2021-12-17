package com.example.pazyniak_spring.service;

import com.example.pazyniak_spring.domain.User;
import com.example.pazyniak_spring.dto.UserDto;
import com.example.pazyniak_spring.mapper.AbstractMapper;
import com.example.pazyniak_spring.mapper.UserMapper;
import com.example.pazyniak_spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, Integer, UserDto> {
    @Autowired
    protected UserRepository userRepository;
    @Autowired
    protected UserMapper userMapper;
    @Override
    protected JpaRepository<User, Integer> getRepository() {
        return userRepository;
    }

    @Override
    protected AbstractMapper<User, UserDto> getMapper() {
        return userMapper;
    }
}
