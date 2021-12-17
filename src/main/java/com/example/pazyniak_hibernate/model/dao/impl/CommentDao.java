package com.example.pazyniak_hibernate.model.dao.impl;

import com.example.pazyniak_hibernate.model.entity.AlbumActor;
import com.example.pazyniak_hibernate.model.entity.Comment;

public class CommentDao extends AbstractDaoImpl<Comment> {
    public CommentDao() {
        super(Comment.class);
    }
}