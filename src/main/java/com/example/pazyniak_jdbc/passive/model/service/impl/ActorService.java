package com.example.pazyniak_jdbc.passive.model.service.impl;


import com.example.pazyniak_jdbc.passive.model.dao.impl.ActorDao;
import com.example.pazyniak_jdbc.passive.model.entities.Actor;
import com.example.pazyniak_jdbc.passive.model.service.Service;

public class ActorService extends AbstractService<Actor,Integer> implements Service<Actor, Integer> {
    public ActorService(){
        super(new ActorDao());
    }
}

