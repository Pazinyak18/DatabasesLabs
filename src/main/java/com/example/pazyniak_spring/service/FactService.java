package com.example.pazyniak_spring.service;

import com.example.pazyniak_spring.domain.Fact;

import com.example.pazyniak_spring.dto.FactDto;
import com.example.pazyniak_spring.mapper.AbstractMapper;
import com.example.pazyniak_spring.mapper.FactMapper;
import com.example.pazyniak_spring.repository.FactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class FactService extends AbstractService<Fact, Integer, FactDto>{
    @Autowired
    protected FactRepository factRepository;
    @Autowired
    protected FactMapper factMapper;

    @Override
    protected JpaRepository<Fact, Integer> getRepository() {
        return factRepository;
    }

    @Override
    protected AbstractMapper<Fact, FactDto> getMapper() {
        return factMapper;
    }
}
