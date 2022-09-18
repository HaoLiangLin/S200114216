package com.gdsdxy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("booktable")
public class Book {
    @TableId("isbn")
    private String ISBN;
    @TableField("BookName")
    private String bookName;
    @TableField("Author")
    private String author;
    @TableField("Publisher")
    private String publisher;
    @TableField("PublishTime")
    private Date publishTime;
    @TableField("Price")
    private double price;
    @TableField("Content")
    private String content;
    @TableField("CategoryId")
    private Integer categoryId;
    @TableField("State")
    private String state;
}
