package com.gdsdxy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdsdxy.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersDao extends BaseMapper<Users> {
}
