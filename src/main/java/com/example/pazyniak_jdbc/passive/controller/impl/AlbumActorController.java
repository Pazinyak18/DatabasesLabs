package com.example.pazyniak_jdbc.passive.controller.impl;

import com.example.pazyniak_jdbc.passive.controller.Controller;
import com.example.pazyniak_jdbc.passive.model.entities.AlbumActor;
import com.example.pazyniak_jdbc.passive.model.service.impl.AlbumActorService;

public class AlbumActorController extends AbstractController<AlbumActor,Integer> implements Controller<AlbumActor, Integer> {
    public AlbumActorController(){
        super(new AlbumActorService());
    }
}