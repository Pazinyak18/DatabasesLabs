package com.example.pazyniak_jdbc.passive.model.dao.impl;

import com.example.pazyniak_jdbc.passive.model.entities.Film;

public class FilmDao  extends AbstractDaoImpl<Film, Integer>  {
    public FilmDao() {
        super(Film.class);
    }
}

