package com.example.pazyniak_spring.controller;


import com.example.pazyniak_spring.domain.Film;
import com.example.pazyniak_spring.dto.FilmDto;
import com.example.pazyniak_spring.mapper.AbstractMapper;
import com.example.pazyniak_spring.mapper.FilmMapper;
import com.example.pazyniak_spring.service.AbstractService;
import com.example.pazyniak_spring.service.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/film")
@RestController
@AllArgsConstructor
public class FilmController extends AbstractController<Film, FilmDto, Integer> {
    @Autowired
    protected FilmService filmService;
    @Autowired
    protected FilmMapper filmMapper;
    @Override
    protected AbstractService<Film, Integer, FilmDto> getService() {
        return filmService;
    }

    @Override
    protected AbstractMapper<Film, FilmDto> getMapper() {
        return filmMapper;
    }
}
