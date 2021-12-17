package com.example.pazyniak_hibernate.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "film")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "filmId", fetch = FetchType.LAZY)
    private Collection<AlbumActor> albumActors;
    @OneToMany(mappedBy = "filmId", fetch = FetchType.LAZY)
    private Collection<Comment> comments;

    public Film(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "description = " + description + ")"+ "\n";
    }
}
