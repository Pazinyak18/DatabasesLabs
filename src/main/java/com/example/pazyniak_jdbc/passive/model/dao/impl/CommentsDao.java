package com.example.pazyniak_jdbc.passive.model.dao.impl;

import com.example.pazyniak_jdbc.passive.model.entities.Comments;

public class CommentsDao  extends AbstractDaoImpl<Comments, Integer>  {
    public CommentsDao() {
        super(Comments.class);
    }
}