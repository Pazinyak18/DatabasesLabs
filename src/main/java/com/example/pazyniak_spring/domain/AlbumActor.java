package com.example.pazyniak_spring.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "album_actor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class AlbumActor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "id", nullable = false)
    private Film filmId;
    @ManyToOne
    @JoinColumn(name = "actor_id", referencedColumnName = "id", nullable = false)
    private Actor actorId;

    @Override
    public String toString() {
        return "AlbumActor{" +
                "id=" + id +
                ", filmId=" + filmId.getId() +
                ", actorId=" + actorId.getId() +
                '}';
    }
}
