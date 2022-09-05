package com.gdsdxy;

import com.gdsdxy.dao.CommentDao;
import com.gdsdxy.pojo.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CommentDaoTest {
    @Autowired
    private CommentDao commentDao;

    @Test
    void addComment() {

        int result = commentDao.addComment(new Comment(11, "这本书不错", "张三", 1));
        if (result > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    @Test
    void deleteComment() {
        int result = commentDao.deleteComment(11);
        if (result > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    @Test
    void selectAllTest() {
        List<Comment> allComment = commentDao.getAllComment();
        allComment.forEach(System.out::println);
    }

    @Test
    void selectOneTest() {
        Comment result = commentDao.getCommentOne(1);
        System.out.println("result = " + result);
    }
}
