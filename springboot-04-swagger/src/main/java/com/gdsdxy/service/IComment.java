package com.gdsdxy.service;

import com.gdsdxy.entity.Comment;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface IComment {
    int addComment(Comment comment);

    int deleteComment(int id);

    int updateComment(Comment comment);

    Comment getByOne(int id);

    List<Comment> getByMap();
}
