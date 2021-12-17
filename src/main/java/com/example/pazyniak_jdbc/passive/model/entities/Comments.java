package com.example.pazyniak_jdbc.passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "comments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class Comments {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "film_id")
    private Integer filmId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "rating")
    private Integer rating;
    @Column(name = "text")
    private String text;
}
