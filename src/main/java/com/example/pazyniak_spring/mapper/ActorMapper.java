package com.example.pazyniak_spring.mapper;

import com.example.pazyniak_spring.domain.Actor;
import com.example.pazyniak_spring.dto.ActorDto;
import org.springframework.stereotype.Component;

@Component
public class ActorMapper extends AbstractMapper<Actor, ActorDto>{
    @Override
    public ActorDto mapObjectToDto(Actor actor) {
        if(actor == null)
        return null;
        ActorDto.ActorDtoBuilder actorDtoBuilder = ActorDto.builder();
        actorDtoBuilder.id(actor.getId());
        actorDtoBuilder.firstName(actor.getFirstName());
        actorDtoBuilder.secondName(actor.getSecondName());
        actorDtoBuilder.rating(actor.getRating());
        return actorDtoBuilder.build();
    }
}
