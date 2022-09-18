package com.gdsdxy;

import com.gdsdxy.entity.Book;
import com.gdsdxy.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class IBookTest {
    @Resource
    private IBookService iBook;

    @Test
    void selectTest() {
        Book book = iBook.getById("9787302333449");
        System.out.println("book = " + book);
    }
}
