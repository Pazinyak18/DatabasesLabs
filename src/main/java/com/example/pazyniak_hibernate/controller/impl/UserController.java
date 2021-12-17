package com.example.pazyniak_hibernate.controller.impl;


import com.example.pazyniak_hibernate.model.dao.impl.AbstractDaoImpl;
import com.example.pazyniak_hibernate.model.dao.impl.UserDao;
import com.example.pazyniak_hibernate.model.entity.User;

public class UserController extends AbstractControllerImpl<User> {
    private final UserDao userDao = new UserDao();

    @Override
    public AbstractDaoImpl<User> getDao(){
        return userDao;
    }

}
