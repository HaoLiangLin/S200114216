package com.gdsdxy.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gdsdxy.dto.ResultVo;
import com.gdsdxy.entity.Book;
import com.gdsdxy.service.IBookService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/books")
public class BookController {
    @Resource
    private IBookService bookService;

    @GetMapping
    public ResultVo getAllBook() {
        List<Book> books = bookService.list();
        return ResultVo.ok(books);
    }
}
