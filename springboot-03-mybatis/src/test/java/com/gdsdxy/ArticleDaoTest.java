package com.gdsdxy;

import com.gdsdxy.dao.ArticleDao;
import com.gdsdxy.pojo.Article;
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
        article.setId(11);
        article.setTitle("测试园");
        article.setContent("测试专用车");
        int result = articleDao.addArticle(article);
        System.out.println(result>0 ? "添加成功" : "添加失败");
    }

    @Test
    void deleteArticleTest() {
        int result = articleDao.deleteArticle(11);
        System.out.println(result>0 ? "删除成功" : "删除失败");
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
