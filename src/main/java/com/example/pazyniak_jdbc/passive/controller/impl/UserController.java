package com.example.pazyniak_jdbc.passive.controller.impl;

import com.example.pazyniak_jdbc.passive.controller.Controller;
import com.example.pazyniak_jdbc.passive.model.entities.User;
import com.example.pazyniak_jdbc.passive.model.service.impl.UserService;

public class UserController  extends AbstractController<User,Integer> implements Controller<User, Integer> {
    public UserController(){
        super(new UserService());
    }
}
