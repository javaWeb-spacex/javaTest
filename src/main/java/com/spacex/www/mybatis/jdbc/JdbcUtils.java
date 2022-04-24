package com.spacex.www.mybatis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {

    //Driver类全名 mysql 5版本
    public static String DRIVER="com.mysql.jdbc.Driver";
    //jdbc协议:子协议://ip:端口号/数据库名
    public static String URL="jdbc:mysql://106.14.253.27:3306/spacex?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    //数据库用户名
    public static String USERNAME="root";
    //数据库密码
    public static String PASSWORD="ABCabc123...";


    /**
     * 获取JDBC连接
     * @return Connection
     */

    public static Connection getConnection(){
        Connection connection=null;
        try {
            //1.加载驱动程序：它通过反射创建一个driver对象。
            Class.forName(DRIVER);

            //2.获得数据连接对象。
            // 在返回connection对象之前，DriverManager它内部会先校验驱动对象driver信息对不对,我们只要知道内部过程即可。
            connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }


}
