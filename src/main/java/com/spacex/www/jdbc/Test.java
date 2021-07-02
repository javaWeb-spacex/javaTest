package com.spacex.www.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        Connection connection=JdbcUtils.getConnection();
        try {
            Statement statement=connection.createStatement();

            String sql="insert into bank(name,money)values('李四',100)";
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
