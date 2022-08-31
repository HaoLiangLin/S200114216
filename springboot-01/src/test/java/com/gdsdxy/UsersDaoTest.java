package com.gdsdxy;

import com.gdsdxy.dao.UsersDao;
import com.gdsdxy.pojo.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UsersDaoTest {
    @Autowired
    private UsersDao usersDao;

    @Test
    void insert() {
        Users users = new Users();
        users.setName("张三");
        users.setAge(22);
        users.setGender("男");
        users.setBirthday("2001-01-19");
        users.setAddress("广东广州");
        int insert = usersDao.insert(users);
        System.out.println(users.getId());
        if (insert > 0) {
            System.out.println("插入成功！");
        } else {
            System.out.println("插入失败");
        }
    }

    @Test
    void delete() {
        int i = usersDao.deleteById(0);
        if (i > 0) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败");
        }
    }

    @Test
    void selectOne() {
        List<Users> users = usersDao.selectByMap(null);
        users.forEach(System.out::println);
    }
}
