package com.gdsdxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gdsdxy.dao")
public class Springboot03MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03MybatisApplication.class, args);
    }

}
