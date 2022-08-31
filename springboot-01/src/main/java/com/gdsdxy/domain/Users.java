package com.gdsdxy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Users {
    @TableId(type = IdType.NONE)
    private long id;
    private String name;
    private int age;
    private String gender;
    private String birthday;
    private String address;
}
