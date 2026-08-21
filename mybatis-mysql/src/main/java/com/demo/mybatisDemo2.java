package com.demo;

import com.demo.mapper.UserMapper;
import com.demo.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * MyBatis 代理开发
 */
public class mybatisDemo2 {
    public static void main(String[] args) throws IOException {
        // 加载Mybatis的核心配置文件，获取SQLSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SQLSession对象, 用它执行SQL
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 执行SQL
        // List<User> users = sqlSession.selectList("test.selectAll");
        // 获取UserMapper接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.selectAll());

        // 释放资源
        sqlSession.close();
    }
}
