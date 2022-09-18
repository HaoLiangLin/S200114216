package com.gdsdxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdsdxy.dao.BookDao;
import com.gdsdxy.entity.Book;
import com.gdsdxy.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class IBookImpl extends ServiceImpl<BookDao, Book> implements IBookService {
}
