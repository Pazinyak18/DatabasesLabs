package com.example.pazyniak_spring.mapper;

import com.example.pazyniak_spring.domain.Comment;
import com.example.pazyniak_spring.dto.CommentDto;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper extends AbstractMapper<Comment, CommentDto> {

    @Override
    public CommentDto mapObjectToDto(Comment comment) {
        if(comment == null)
        return null;
        CommentDto.CommentDtoBuilder commentDtoBuilder = CommentDto.builder();
        commentDtoBuilder.id(comment.getId());
        commentDtoBuilder.filmName(comment.getFilmId().getName());
        commentDtoBuilder.userName(comment.getUserId().getName());
        commentDtoBuilder.rating(comment.getRating());
        commentDtoBuilder.text(comment.getText());
        return commentDtoBuilder.build();
    }
}
