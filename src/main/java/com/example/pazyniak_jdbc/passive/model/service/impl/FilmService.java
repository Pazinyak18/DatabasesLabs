package com.example.pazyniak_jdbc.passive.model.service.impl;

import com.example.pazyniak_jdbc.passive.model.dao.impl.FilmDao;
import com.example.pazyniak_jdbc.passive.model.entities.Film;
import com.example.pazyniak_jdbc.passive.model.service.Service;

public class FilmService extends AbstractService<Film, Integer> implements Service<Film, Integer> {
    public FilmService() {
        super(new FilmDao());
    }
}