package com.gdsdxy.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "student")
public class Student {
    private long id;
    private String name;
    private Integer age;
    private String gender;
    private String course;
    private Map<String, Integer> scores;
}
