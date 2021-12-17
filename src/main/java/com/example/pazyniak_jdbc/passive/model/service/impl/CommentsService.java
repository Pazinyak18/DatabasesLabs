package com.example.pazyniak_jdbc.passive.model.service.impl;

import com.example.pazyniak_jdbc.passive.model.dao.impl.CommentsDao;
import com.example.pazyniak_jdbc.passive.model.entities.Comments;
import com.example.pazyniak_jdbc.passive.model.service.Service;

public class CommentsService extends AbstractService<Comments, Integer> implements Service<Comments, Integer> {
    public CommentsService() {
        super(new CommentsDao());
    }
}