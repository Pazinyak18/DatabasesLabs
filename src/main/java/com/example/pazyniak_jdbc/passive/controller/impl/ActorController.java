package com.example.pazyniak_jdbc.passive.controller.impl;

import com.example.pazyniak_jdbc.passive.controller.Controller;
import com.example.pazyniak_jdbc.passive.model.entities.Actor;
import com.example.pazyniak_jdbc.passive.model.service.impl.ActorService;

public class ActorController extends AbstractController<Actor,Integer> implements Controller<Actor, Integer> {
    public ActorController(){
        super(new ActorService());
    }
}
