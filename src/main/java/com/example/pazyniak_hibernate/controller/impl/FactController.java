package com.example.pazyniak_hibernate.controller.impl;

import com.example.pazyniak_hibernate.model.dao.impl.AbstractDaoImpl;
import com.example.pazyniak_hibernate.model.dao.impl.FactDao;
import com.example.pazyniak_hibernate.model.entity.Fact;


public class FactController extends AbstractControllerImpl<Fact> {
    private final FactDao factDao = new FactDao();

    @Override
    public AbstractDaoImpl<Fact> getDao(){
        return factDao;
    }

}
