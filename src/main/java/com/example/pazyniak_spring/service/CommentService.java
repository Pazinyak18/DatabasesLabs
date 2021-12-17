package com.example.pazyniak_spring.service;

import com.example.pazyniak_spring.domain.Comment;
import com.example.pazyniak_spring.dto.CommentDto;
import com.example.pazyniak_spring.mapper.AbstractMapper;
import com.example.pazyniak_spring.mapper.CommentMapper;
import com.example.pazyniak_spring.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends AbstractService<Comment, Integer, CommentDto> {
    @Autowired
    protected CommentRepository commentRepository;
    @Autowired
    protected CommentMapper commentMapper;

    @Override
    protected JpaRepository<Comment, Integer> getRepository() {
        return commentRepository;
    }

    @Override
    protected AbstractMapper<Comment, CommentDto> getMapper() {
        return commentMapper;
    }
}
