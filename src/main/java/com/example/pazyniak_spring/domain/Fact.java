package com.example.pazyniak_spring.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "facts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Fact{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User userId;
    @Column(name = "text")
    private String text;

    @Override
    public String toString() {
        return "Fact{" +
                "id=" + id +
                ", userId=" + userId.getId() +
                ", text='" + text + '\'' +
                '}'+ "\n";
    }
}
