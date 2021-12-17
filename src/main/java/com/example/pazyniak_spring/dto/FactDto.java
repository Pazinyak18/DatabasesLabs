package com.example.pazyniak_spring.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FactDto {
    private Integer id;
    private String userName;
    private String text;
}
