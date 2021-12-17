package com.example.pazyniak_spring.mapper;

import com.example.pazyniak_spring.domain.Film;
import com.example.pazyniak_spring.dto.FilmDto;
import org.springframework.stereotype.Component;

@Component
public class FilmMapper extends AbstractMapper<Film, FilmDto>{
    @Override
    public FilmDto mapObjectToDto(Film film) {
        if(film == null)
        return null;
        FilmDto.FilmDtoBuilder filmDtoBuilder = FilmDto.builder();
        filmDtoBuilder.id(film.getId());
        filmDtoBuilder.name(film.getName());
        filmDtoBuilder.description(film.getDescription());
        filmDtoBuilder.commentsNumber(film.getComments().size());
        return filmDtoBuilder.build();
    }
}
