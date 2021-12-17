package com.example.pazyniak_hibernate.controller.impl;

import com.example.pazyniak_hibernate.model.dao.impl.AbstractDaoImpl;
import com.example.pazyniak_hibernate.model.dao.impl.CommentDao;
import com.example.pazyniak_hibernate.model.entity.Comment;

public class CommentController extends AbstractControllerImpl<Comment> {
    private final CommentDao commentDao = new CommentDao();

    @Override
    public AbstractDaoImpl<Comment> getDao() {
        return commentDao;
    }

}
