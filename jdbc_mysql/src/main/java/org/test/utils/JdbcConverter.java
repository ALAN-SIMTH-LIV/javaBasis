package org.test.utils;

import org.test.po.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Jdbc转换实体工具类
 */
public class JdbcConverter {

    /**
     * JDBC查询结果转换User实体
     * @param rs 结果集
     * @return User
     * @throws SQLException
     */
    public static User convertResultSetToUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setAge(rs.getString("age"));
        user.setSex(rs.getInt("sex"));
        return user;
    }
}
