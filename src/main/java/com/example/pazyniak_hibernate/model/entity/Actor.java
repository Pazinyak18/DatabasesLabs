package com.example.pazyniak_hibernate.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
@Entity
@Table(name = "actor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class  Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "rating")
    private Integer rating;
    @OneToMany(mappedBy = "actorId", fetch = FetchType.LAZY)
    private Collection<AlbumActor> albumActors;

    public Actor(Integer id, String firstName, String secondName, Integer rating) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "firstName = " + firstName + ", " +
                "secondName = " + secondName + ", " +
                "rating = " + rating + ")"+ "\n";
    }
}
