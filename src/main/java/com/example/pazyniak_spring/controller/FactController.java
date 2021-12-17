package com.example.pazyniak_spring.controller;


import com.example.pazyniak_spring.domain.Fact;
import com.example.pazyniak_spring.dto.FactDto;
import com.example.pazyniak_spring.mapper.AbstractMapper;
import com.example.pazyniak_spring.mapper.FactMapper;
import com.example.pazyniak_spring.service.AbstractService;
import com.example.pazyniak_spring.service.FactService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/fact")
@RestController
@AllArgsConstructor
public class FactController extends AbstractController<Fact, FactDto, Integer> {
    @Autowired
    protected FactService factService;
    @Autowired
    protected FactMapper factMapper;
    @Override
    protected AbstractService<Fact, Integer, FactDto> getService() {
        return factService;
    }

    @Override
    protected AbstractMapper<Fact, FactDto> getMapper() {
        return factMapper;
    }
}
