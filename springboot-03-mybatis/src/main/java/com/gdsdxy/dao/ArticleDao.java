package com.gdsdxy.dao;

import com.gdsdxy.pojo.Article;
import com.gdsdxy.pojo.Comment;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleDao {
    @Insert("insert into t_article(id, title, content) values(#{id}, #{title}, #{content})")
    int addArticle(Article article);

    @Delete("delete from t_article where id = #{id}")
    int deleteArticle(int id);

    @UpdateProvider(type = SqlBuild.class, method = "update")
    int updateArticle(Article article);

    @Select("select id,title,content from t_article where id = #{id}")
    Article selectOne(int id);

    @Select("select id,title,content from t_article")
    List<Article> selectAll();

    class SqlBuild {
        public String update(Article article) {
            SQL sql = new SQL();
            sql.UPDATE("t_article");
            if (article.getTitle() != null) {
                sql.SET("title=#{title}");
            }
            if (article.getContent() != null) {
                sql.SET("content=#{content}");
            }
            return sql.toString();
        }
    }
}
