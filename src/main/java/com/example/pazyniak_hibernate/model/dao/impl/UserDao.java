package com.example.pazyniak_hibernate.model.dao.impl;

import com.example.pazyniak_hibernate.model.entity.User;

public class UserDao  extends AbstractDaoImpl<User> {
    public UserDao() {
        super(User.class);
    }
}