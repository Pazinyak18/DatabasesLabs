package com.example.pazyniak_hibernate.controller.impl;

import com.example.pazyniak_hibernate.controller.AbstractController;
import com.example.pazyniak_hibernate.model.dao.impl.AbstractDaoImpl;

import java.util.List;

public abstract class AbstractControllerImpl<E> implements AbstractController<E> {
    public abstract AbstractDaoImpl<E> getDao();

    @Override
    public List<E> findAll() {
        return (List<E>) getDao().findAll();
    }

    @Override
    public E findOne(Integer id) {
        return getDao().findOne(id);
    }

    @Override
    public void create(E object) {
        getDao().create(object);
    }

    @Override
    public void update(Integer id, E object) {
        getDao().update(id, object);
    }

    @Override
    public void delete(Integer id) {
        getDao().delete(id);
    }

}
