package com.example.pazyniak_spring.repository;

import com.example.pazyniak_spring.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
