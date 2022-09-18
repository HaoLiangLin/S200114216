package com.gdsdxy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdsdxy.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
