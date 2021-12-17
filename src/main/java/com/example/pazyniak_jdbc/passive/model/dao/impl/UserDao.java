package com.example.pazyniak_jdbc.passive.model.dao.impl;

import com.example.pazyniak_jdbc.passive.model.entities.User;

public class UserDao extends AbstractDaoImpl<User, Integer>  {
    public UserDao() {
        super(User.class);
    }
}
