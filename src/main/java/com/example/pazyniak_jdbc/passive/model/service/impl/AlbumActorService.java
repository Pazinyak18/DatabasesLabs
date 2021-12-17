package com.example.pazyniak_jdbc.passive.model.service.impl;


import com.example.pazyniak_jdbc.passive.model.dao.impl.AlbumActorDao;
import com.example.pazyniak_jdbc.passive.model.entities.AlbumActor;
import com.example.pazyniak_jdbc.passive.model.service.Service;

public class AlbumActorService extends AbstractService<AlbumActor, Integer> implements Service<AlbumActor, Integer> {
    public AlbumActorService() {
        super(new AlbumActorDao());
    }
}