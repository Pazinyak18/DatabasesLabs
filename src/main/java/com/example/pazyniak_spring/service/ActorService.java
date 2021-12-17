package com.example.pazyniak_spring.service;

import com.example.pazyniak_spring.domain.Actor;
import com.example.pazyniak_spring.dto.ActorDto;
import com.example.pazyniak_spring.mapper.AbstractMapper;
import com.example.pazyniak_spring.mapper.ActorMapper;
import com.example.pazyniak_spring.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ActorService extends AbstractService<Actor, Integer, ActorDto> {
    @Autowired
    protected ActorRepository actorRepository;
    @Autowired
    protected ActorMapper actorMapper;
    @Override
    protected JpaRepository<Actor, Integer> getRepository() {
        return actorRepository;
    }

    @Override
    protected AbstractMapper<Actor, ActorDto> getMapper() {
        return actorMapper;
    }
}
