package com.example.pazyniak_hibernate.controller;


import com.example.pazyniak_hibernate.model.dao.impl.AbstractDaoImpl;

import java.util.List;

public interface AbstractController<E> {

    AbstractDaoImpl<E> getDao();

    List<E> findAll();

    E findOne(Integer id);

    void create(E entity);

    void update(Integer id, E entity);

    void delete(Integer id);
}
