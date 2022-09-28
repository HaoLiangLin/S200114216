package com.gdsdxy;

import com.gdsdxy.dao.ArticleDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ArticleDaoTest {
    @Resource
    private ArticleDao articleDao;

    @Test
    void selectTest() {
    }
}
