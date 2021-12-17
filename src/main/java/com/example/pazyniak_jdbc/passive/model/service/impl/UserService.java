package com.example.pazyniak_jdbc.passive.model.service.impl;

import com.example.pazyniak_jdbc.passive.model.dao.impl.UserDao;
import com.example.pazyniak_jdbc.passive.model.entities.User;
import com.example.pazyniak_jdbc.passive.model.service.Service;

public class UserService extends AbstractService<User, Integer> implements Service<User, Integer> {
    public UserService() {
        super(new UserDao());
    }
}