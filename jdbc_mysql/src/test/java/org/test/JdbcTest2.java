package org.test;

import org.test.po.User;
import org.test.utils.DbConnection;
import org.test.utils.JdbcConverter;
import org.test.utils.Response;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcTest2 {
    public static void main(String[] args) {
        // System.out.println(insert());
        // System.out.println(delete(13));
        // System.out.println(update(10, "小红", "20", "1"));
        System.out.println(selectById(1));
        System.out.println(selectAll());
    }

    private static Response<Void> insert(){ // 新增
        try(Connection connection = DbConnection.getConnection();){
            String sql = "insert into users (name,age,sex) values(?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"神秘人2");
            statement.setString(2,"20");
            statement.setInt(3,0);
            statement.executeUpdate();
            return Response.success();
        } catch (Exception e){
            e.printStackTrace();
        }
        return Response.error(0,"添加失败");
    }

    private static Response<Void> delete(int id){ // 删除
        try( Connection connection = DbConnection.getConnection();){
            String sql = "delete from users where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            if (statement.executeUpdate() > 0) {
                return Response.success();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return Response.error(0,"删除失败");
    }

    private static Response<Void> update(Integer id,String name,String age,String sex){ // 修改
        try( Connection connection = DbConnection.getConnection();){
            String sql = "update users set name=?,age=?,sex=? where id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,name);
            statement.setString(2,age);
            statement.setString(3,sex);
            statement.setInt(4,id);
            if (statement.executeUpdate() > 0) {
                return Response.success();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return Response.error(0,"更新失败");
    }

    private static Response<User> selectById(Integer id){ // ID查询
        try( Connection connection = DbConnection.getConnection();){
            String sql = "select * from users where id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                return Response.success(JdbcConverter.convertResultSetToUser(resultSet));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return Response.error(0,"查询失败");
    }

    private static Response<List<User>> selectAll(){  // 查询所有
        try( Connection connection = DbConnection.getConnection();){
            String sql = "select * from users order by id ";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            List<User> list = new ArrayList<>();
            while(resultSet.next()){
                list.add(JdbcConverter.convertResultSetToUser(resultSet));
            }
            return Response.success(list);
        } catch (Exception e){
            return Response.error(0,"查询失败");
        }
    }
}
