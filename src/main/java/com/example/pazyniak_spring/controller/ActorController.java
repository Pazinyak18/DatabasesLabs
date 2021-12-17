package com.example.pazyniak_spring.controller;


import com.example.pazyniak_spring.domain.Actor;
import com.example.pazyniak_spring.dto.ActorDto;
import com.example.pazyniak_spring.mapper.AbstractMapper;
import com.example.pazyniak_spring.mapper.ActorMapper;
import com.example.pazyniak_spring.service.AbstractService;
import com.example.pazyniak_spring.service.ActorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/actor")
@RestController
@AllArgsConstructor
public class ActorController extends AbstractController<Actor, ActorDto, Integer>{

    @Autowired
    protected ActorService actorService;
    @Autowired
    protected ActorMapper actorMapper;

    @Override
    protected AbstractService<Actor, Integer, ActorDto> getService() {
        return actorService;
    }

    @Override
    protected AbstractMapper<Actor, ActorDto> getMapper() {
        return actorMapper;
    }
}
