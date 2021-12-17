package com.example.pazyniak_jdbc.passive.controller.impl;

import com.example.pazyniak_jdbc.passive.controller.Controller;
import com.example.pazyniak_jdbc.passive.model.entities.Comments;
import com.example.pazyniak_jdbc.passive.model.service.impl.CommentsService;

public class CommentsController extends AbstractController<Comments,Integer> implements Controller<Comments, Integer> {
    public CommentsController(){
        super(new CommentsService());
    }
}