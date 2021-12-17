package com.example.pazyniak_jdbc.passive.controller.impl;

import com.example.pazyniak_jdbc.passive.controller.Controller;
import com.example.pazyniak_jdbc.passive.model.entities.Film;
import com.example.pazyniak_jdbc.passive.model.service.impl.FilmService;

public class FilmController  extends AbstractController<Film,Integer> implements Controller<Film, Integer> {
    public FilmController(){
        super(new FilmService());
    }
}
