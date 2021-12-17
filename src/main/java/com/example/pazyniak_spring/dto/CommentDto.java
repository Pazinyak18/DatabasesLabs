package com.example.pazyniak_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CommentDto {
    private Integer id;
    private String filmName;
    private String userName;
    private Integer rating;
    private String text;
}
