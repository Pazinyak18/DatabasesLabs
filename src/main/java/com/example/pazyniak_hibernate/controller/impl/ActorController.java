package com.example.pazyniak_hibernate.controller.impl;

import com.example.pazyniak_hibernate.model.dao.impl.AbstractDaoImpl;
import com.example.pazyniak_hibernate.model.dao.impl.ActorDao;
import com.example.pazyniak_hibernate.model.entity.Actor;


public class ActorController extends AbstractControllerImpl<Actor> {
    private final ActorDao actorDao = new ActorDao();

    @Override
    public AbstractDaoImpl<Actor> getDao() {
        return actorDao;
    }

}