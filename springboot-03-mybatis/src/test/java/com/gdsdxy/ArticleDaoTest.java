package com.gdsdxy;

import com.gdsdxy.dao.ArticleDao;
import com.gdsdxy.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ArticleDaoTest {
    @Autowired
    private ArticleDao articleDao;

    @Test
    void addArticleTest() {
        Article article = new Article();
        article.setId(12);
        article.setTitle("测试园");
        article.setContent("测试专用车");
        int result = articleDao.addArticle(article);
        System.out.println(result>0 ? "添加成功" : "添加失败");
    }

    @Test
    void deleteArticleTest() {
        int result = articleDao.deleteArticle(12);
        System.out.println(result>0 ? "删除成功" : "删除失败");
    }

    @Test
    void updateArticleTest() {
        Article article = new Article();
        article.setId(1);
        article.setTitle("Spring boot基础入门");
        article.setContent("从入门到精通讲解...修改");
        int result = articleDao.updateArticle(article);
        System.out.println(result>0 ? "修改成功" : "修改失败");
    }

    @Test
    void selectOneTest() {
        Article article = articleDao.selectOne(1);
        System.out.println("article = " + article);
    }

    @Test
    void selectAllTest() {
        List<Article> articles = articleDao.selectAll();
        articles.forEach(System.out::println);
    }
}
