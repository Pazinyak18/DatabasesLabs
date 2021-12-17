package com.example.pazyniak_spring.service;

import com.example.pazyniak_spring.domain.Film;
import com.example.pazyniak_spring.dto.FilmDto;
import com.example.pazyniak_spring.mapper.AbstractMapper;
import com.example.pazyniak_spring.mapper.FilmMapper;
import com.example.pazyniak_spring.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class FilmService extends AbstractService<Film, Integer, FilmDto> {
    @Autowired
    protected FilmRepository filmRepository;
    @Autowired
    protected FilmMapper filmMapper;
    @Override
    protected JpaRepository<Film, Integer> getRepository() {
        return filmRepository;
    }

    @Override
    protected AbstractMapper<Film, FilmDto> getMapper() {
        return filmMapper;
    }
}
