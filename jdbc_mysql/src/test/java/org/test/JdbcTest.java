package org.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcTest {
    public static void main(String[] args) {
        // insert();
        // delete(8);
        // update(7,"小梁","20","0");
        // System.out.println(selectById(1));
        System.out.println(selectAll());
    }

    private static void insert(){ // 新增
        try( Connection connection = DbConnection.getConnection();){
            String sql = "insert into users (name,age,sex) values(?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"神秘人2");
            statement.setString(2,"20");
            statement.setInt(3,0);
            statement.executeUpdate();
            System.out.println("添加成功");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void delete(int id){
        try( Connection connection = DbConnection.getConnection();){
            String sql = "delete from users where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            if (statement.executeUpdate() > 0) {
                System.out.println("删除成功");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void update(Integer id,String name,String age,String sex){
        try( Connection connection = DbConnection.getConnection();){
            String sql = "update users set name=?,age=?,sex=? where id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,name);
            statement.setString(2,age);
            statement.setString(3,sex);
            statement.setInt(4,id);
            if (statement.executeUpdate() > 0) {
                System.out.println("更新成功");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Map<String, Object> selectById(Integer id){
        try( Connection connection = DbConnection.getConnection();){
            String sql = "select * from users where id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                Map<String,Object> user = new HashMap<>();
                user.put("id",resultSet.getInt("id"));
                user.put("name",resultSet.getString("name"));
                user.put("age",resultSet.getString("age"));
                user.put("sex",resultSet.getString("sex"));
                return user;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static List<Object> selectAll(){
        try( Connection connection = DbConnection.getConnection();){
            String sql = "select * from users order by id ";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            List<Object> list = new ArrayList<>();
            while(resultSet.next()){
                Map<String,Object> user = new HashMap<>();
                user.put("id",resultSet.getInt("id"));
                user.put("name",resultSet.getString("name"));
                user.put("age",resultSet.getString("age"));
                user.put("sex",resultSet.getString("sex"));

                list.add(user);
            }
            return list;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
