package com.gdsdxy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("stocktable")
public class Stock {
    @TableId("BookId")
    private String bookId;
    @TableField("isbn")
    private String ISBN;
    @TableField("State")
    private String state;
}
