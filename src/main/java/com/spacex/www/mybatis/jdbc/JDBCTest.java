package com.spacex.www.mybatis.jdbc;

import org.junit.Test;

import java.sql.*;

public class JDBCTest {
    @Test
    public void test1() {
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();

            String sql = "insert into bank(name,money)values('李四',100)";
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *   MyBatis获取参数值的两种方式：${}和 #{}
     *   ${}的本质就是字符串拼接
     *   #{}的本质就是占位符赋值
     */
    @Test
    public void testJDBC() throws Exception {
        String userName = "admin";
        Connection connection = JdbcUtils.getConnection();
//        connection.prepareStatement("select * from t_user where username='" + userName + "'");
        PreparedStatement ps = connection.prepareStatement("select * from t_user where username = ?");
        ps.setString(1,userName);
    }

    @Test
    public void getPrimaryKey() throws Exception {

        Connection connection = JdbcUtils.getConnection();

        PreparedStatement ps = connection.prepareStatement("select * from t_user",Statement.RETURN_GENERATED_KEYS);
        ps.executeQuery();
        ResultSet generatedKeys = ps.getGeneratedKeys();

    }



}
