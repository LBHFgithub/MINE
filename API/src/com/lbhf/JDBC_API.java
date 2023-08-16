package com.lbhf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC_API {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","root123");
        Connection connection = DriverManager.getConnection(url,[properties]);
        //执行sql
        Statement statement = connection.createStatement();
        String sql = "update user set name ='LBHF' where id = 1";
        int i = statement.executeUpdate(sql);
        //关闭连接
        statement.close();
        connection.close();
    }
}
