package com.gdsdxy.dao;

import com.gdsdxy.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CommentDao extends JpaRepository<Comment, Integer> {
    List<Comment> findByAuthor(String author);

    List<Comment> findByIdBetween(Integer id1, Integer id2);

    List<Comment> findByIdGreaterThan(Integer id);

    List<Comment> findByIdGreaterThanEqual(Integer id);

    List<Comment> findAllByOrderByIdDesc();

    @Query(value = "select id,content,author,article_id from t_comment where id = ?1", nativeQuery = true)
    Comment queryCommentById(Integer id);

    @Modifying
    @Query(value = "delete from t_comment where author = ?1", nativeQuery = true)
    Integer deleteByAuthor(String author);
}
