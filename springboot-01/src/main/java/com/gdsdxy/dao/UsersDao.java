package com.gdsdxy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdsdxy.domain.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersDao extends BaseMapper<Users> {
}
