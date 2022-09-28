package com.gdsdxy.dao;

import com.gdsdxy.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JpaRepository<Article,Integer>
 * Article 实体类操作
 * Integer 主键的数据类型
 */
@Repository
public interface ArticleDao extends JpaRepository<Article,Integer> {
}
