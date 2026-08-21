package com.demo.mapper;

import com.demo.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    User selectById(@Param("id") int id);
}
