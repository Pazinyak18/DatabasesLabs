package com.example.pazyniak_jdbc.passive.model.service.impl;


import com.example.pazyniak_jdbc.passive.model.dao.impl.FactsDao;
import com.example.pazyniak_jdbc.passive.model.entities.Facts;
import com.example.pazyniak_jdbc.passive.model.service.Service;

public class FactsService extends AbstractService<Facts, Integer> implements Service<Facts, Integer> {
    public FactsService() {
        super(new FactsDao());
    }
}
