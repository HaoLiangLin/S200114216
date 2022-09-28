package com.gdsdxy;

import com.gdsdxy.dao.CommentDao;
import com.gdsdxy.entity.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class CommentTest {
    @Resource
    private CommentDao commentDao;

    @Test
    void selectTest1() {
        List<Comment> commentList = commentDao.findByAuthor("张三");
        System.out.println(commentList);
    }

    @Test
    void selectTest2() {
        List<Comment> commentList = commentDao.findByIdBetween(1, 3);
        commentList.forEach(System.out::println);
    }

    @Test
    void selectTest3() {
        List<Comment> commentList = commentDao.findByIdGreaterThan(3);
        commentList.forEach(System.out::println);
    }

    @Test
    void selectTest4() {
        List<Comment> commentList = commentDao.findByIdGreaterThanEqual(3);
        commentList.forEach(System.out::println);
    }

    @Test
    void selectTest5() {
        List<Comment> commentList = commentDao.findAllByOrderByIdDesc();
        commentList.forEach(System.out::println);
    }

    @Test
    void selectTest6() {
        Comment commentList = commentDao.queryCommentById(1);
        System.out.println("commentList = " + commentList);
    }

    @Test
    void insertTest1() {
        commentDao.save(new Comment(6, "还行", "homer", 1));
    }

    @Test
    void updateTest() {
        commentDao.save(new Comment(6, "还行（修改）", "homer", 1));
    }

    @Test
    void deleteTest() {
        commentDao.deleteById(6);
    }

    @Test
    void deleteTest2() {
        Integer result = commentDao.deleteByAuthor("homer");
        System.out.println("result = " + result);
    }

    @Test
    void pageHelp() {
        Pageable pageable = PageRequest.of(1, 2);
        Page<Comment> commentList = commentDao.findAll(pageable);
        List<Comment> content = commentList.getContent();
        content.forEach(System.out::println);
    }


}
