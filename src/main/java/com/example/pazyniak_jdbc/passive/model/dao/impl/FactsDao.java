package com.example.pazyniak_jdbc.passive.model.dao.impl;


import com.example.pazyniak_jdbc.passive.model.entities.Facts;

public class FactsDao extends AbstractDaoImpl<Facts, Integer>  {
    public FactsDao() {
        super(Facts.class);
    }
}
