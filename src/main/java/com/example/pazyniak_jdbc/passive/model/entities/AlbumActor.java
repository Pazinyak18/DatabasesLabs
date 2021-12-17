package com.example.pazyniak_jdbc.passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "album_actor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class AlbumActor {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "film_id")
    private Integer filmId;
    @Column(name = "actor_id")
    private Integer actorId;
}
