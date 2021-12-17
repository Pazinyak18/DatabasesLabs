package com.example.pazyniak_spring.mapper;

import com.example.pazyniak_spring.domain.Fact;
import com.example.pazyniak_spring.dto.FactDto;
import org.springframework.stereotype.Component;

@Component
public class FactMapper extends AbstractMapper<Fact, FactDto>{
    @Override
    public FactDto mapObjectToDto(Fact fact) {
        if(fact == null)
        return null;
        FactDto.FactDtoBuilder factDtoBuilder = FactDto.builder();
        factDtoBuilder.id(fact.getId());
        factDtoBuilder.userName(fact.getUserId().getName());
        factDtoBuilder.text(fact.getText());
        return factDtoBuilder.build();
        
    }
}
