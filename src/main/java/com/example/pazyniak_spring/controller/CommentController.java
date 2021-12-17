package com.example.pazyniak_spring.controller;

import com.example.pazyniak_spring.domain.Comment;
import com.example.pazyniak_spring.dto.CommentDto;
import com.example.pazyniak_spring.mapper.AbstractMapper;
import com.example.pazyniak_spring.mapper.CommentMapper;
import com.example.pazyniak_spring.service.AbstractService;
import com.example.pazyniak_spring.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/comment")
@RestController
@AllArgsConstructor
public class CommentController extends AbstractController<Comment, CommentDto, Integer>{
    @Autowired
    protected CommentService commentService;
    @Autowired
    protected CommentMapper commentMapper;

    @Override
    protected AbstractService<Comment, Integer, CommentDto> getService() {
        return commentService;
    }

    @Override
    protected AbstractMapper<Comment, CommentDto> getMapper() {
        return commentMapper;
    }
}
