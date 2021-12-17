package com.example.pazyniak_hibernate.controller.impl;

import com.example.pazyniak_hibernate.model.dao.impl.AbstractDaoImpl;
import com.example.pazyniak_hibernate.model.dao.impl.FilmDao;
import com.example.pazyniak_hibernate.model.entity.Film;


public class FilmController extends AbstractControllerImpl<Film> {
    private final FilmDao filmDao = new FilmDao();

    @Override
    public AbstractDaoImpl<Film> getDao(){
        return filmDao;
    }

}
