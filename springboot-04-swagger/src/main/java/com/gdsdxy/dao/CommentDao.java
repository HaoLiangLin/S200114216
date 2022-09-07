package com.gdsdxy.dao;

import com.gdsdxy.entity.Comment;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentDao {
    @Insert("insert into t_comment(id, content, author, article_id) values (#{id},#{content},#{author},#{articleId})")
    int addComment(Comment comment);

    @Delete("delete from t_comment where id =#{id}")
    int deleteComment(Integer id);

    @UpdateProvider(type = SqlBuild.class, method = "update")
    int updateComment(Comment comment);

    @Select("select id,content,author,article_id from t_comment")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "content", property = "content"),
            @Result(column = "author", property = "author"),
            @Result(column = "article_id", property = "articleId"),
    })
    List<Comment> getAllComment();

    @Select("select id,content,author,article_id from t_comment where id =#{id}")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "content", property = "content"),
            @Result(column = "author", property = "author"),
            @Result(column = "article_id", property = "articleId"),
    })
    Comment getCommentOne(Integer id);

    @Select("select id,content,author,article_id from t_comment where article_id = #{id}")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "content", property = "content"),
            @Result(column = "author", property = "author"),
            @Result(column = "article_id", property = "articleId"),
    })
    List<Comment> getArticleById(int id);

    class SqlBuild {
        public String update(Comment comment) {
            SQL sql = new SQL();
            sql.UPDATE("t_comment");
            if (comment.getAuthor() != null) {
                sql.SET("author=#{author}");
            }
            if (comment.getContent() != null) {
                sql.SET("content=#{content}");
            }
            if (comment.getArticleId() != null) {
                sql.SET("article_id=#{articleId}");
            }
            sql.WHERE("id = #{id}");
            return sql.toString();
        }
    }
}
