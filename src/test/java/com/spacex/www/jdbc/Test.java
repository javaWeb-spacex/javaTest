package com.spacex.www.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    @org.junit.Test
    public void Statement(){
        Connection connection=JdbcUtils.getConnection();
        try {
            Statement statement=connection.createStatement();

            String sql="insert into bank(name,money)values('李四',1000)";
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
