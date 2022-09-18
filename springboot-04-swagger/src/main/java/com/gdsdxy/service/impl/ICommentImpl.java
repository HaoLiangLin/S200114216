package com.gdsdxy.service.impl;

import com.gdsdxy.dao.CommentDao;
import com.gdsdxy.entity.Comment;
import com.gdsdxy.service.IComment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ICommentImpl implements IComment {
    @Resource
    private CommentDao commentDao;

    @Override
    public int addComment(Comment comment) {
        return commentDao.addComment(comment);
    }

    @Override
    public int deleteComment(int id) {
        return commentDao.deleteComment(id);
    }

    @Override
    public int updateComment(Comment comment) {
        return commentDao.updateComment(comment);
    }

    @Override
    public Comment getByOne(int id) {
        return commentDao.getCommentOne(id);
    }

    @Override
    public List<Comment> getByMap() {
        return commentDao.getAllComment();
    }
}
