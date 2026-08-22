package org.demo.mybaitsplusmysql;

import org.demo.mybaitsplusmysql.entity.User;
import org.demo.mybaitsplusmysql.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybaitsPlusMysqlApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = User.builder()
                .name("测试数据1")
                .age("19")
                .sex(0)
                .build();
        userMapper.insert(user);
    }

    @Test
    public void select(){
        System.out.println(userMapper.selectById(26));
    }

    @Test
    public void update(){
        userMapper.updateById(
                User.builder()
                        .id(26)
                        .name("🧒")
                        .build()
        );

        System.out.println(userMapper.selectById(26));
    }

    @Test
    public void delete(){
        userMapper.deleteById(26);
    }
}
