package com.example.pazyniak_spring.mapper;

public abstract class AbstractMapper<T, DTO> {
    public abstract DTO mapObjectToDto(T object);

}