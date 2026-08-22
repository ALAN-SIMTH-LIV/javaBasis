package org.demo.mybaitsplusmysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.demo.mybaitsplusmysql.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
