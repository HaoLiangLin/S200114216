package com.gdsdxy;

import com.gdsdxy.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ApplicationTests {
    @Autowired
    private Student student;

    @Value("${student.course}")
    private String course;

    @Test
    void contextLoads() {
        System.out.println(student);
        System.out.println(course);
    }

}
