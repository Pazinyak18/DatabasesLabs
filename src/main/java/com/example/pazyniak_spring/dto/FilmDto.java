package com.example.pazyniak_spring.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilmDto {
    private Integer id;
    private String name;
    private String description;
    private Integer commentsNumber;

}
