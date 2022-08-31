package com.gdsdxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdsdxy.dao.UsersDao;
import com.gdsdxy.domain.Users;
import com.gdsdxy.service.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersDao, Users> implements UsersService {
}
