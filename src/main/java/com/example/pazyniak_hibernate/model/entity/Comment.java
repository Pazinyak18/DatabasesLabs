package com.example.pazyniak_hibernate.model.entity;


import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "comments")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn (name = "film_id", referencedColumnName = "id", nullable = false)
    private Film filmId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User userId;
    @Column(name = "rating")
    private Integer rating;
    @Column(name = "text")
    private String text;

    public Comment(Integer id, Film filmId, User userId, Integer rating, String text) {
        this.id = id;
        this.filmId = filmId;
        this.userId = userId;
        this.rating = rating;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", filmId=" + filmId +
                ", userId=" + userId.getId() +
                ", rating=" + rating +
                ", text='" + text + '\'' +
                '}'+ "\n";
    }
}
