package com.gdsdxy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_goods")
public class Goods {
    @TableId("id")
    private Integer id;
    @TableField("name")
    private String name;
    @TableField("price")
    private Long price;
    @TableField("pubdate")
    private Date pubdate;
    @TableField("typeName")
    private String typeName;
    @TableField("intro")
    private String intro;
    @TableField("picture")
    private String picture;
    @TableField("flag")
    private Integer flag;
    @TableField("star")
    private Integer star;
}
