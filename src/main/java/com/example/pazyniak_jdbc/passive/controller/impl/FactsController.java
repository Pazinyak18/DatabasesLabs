package com.example.pazyniak_jdbc.passive.controller.impl;

import com.example.pazyniak_jdbc.passive.controller.Controller;
import com.example.pazyniak_jdbc.passive.model.entities.Facts;
import com.example.pazyniak_jdbc.passive.model.service.impl.FactsService;

public class FactsController  extends AbstractController<Facts,Integer> implements Controller<Facts, Integer> {
    public FactsController(){
        super(new FactsService());
    }
}