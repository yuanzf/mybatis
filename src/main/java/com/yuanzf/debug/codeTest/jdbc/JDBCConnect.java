package com.yuanzf.debug.codeTest.jdbc;

import com.yuanzf.debug.mapper.UserMapper;
import sun.dc.pr.PRError;

import java.sql.*;

/**
 * @Author: yzf
 * @Date: 2019-01-28 11:26
 * @Desoription:
 */
public class JDBCConnect {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/cloud_product?useUnicode=true&characterEncoding=utf-8";

    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public JDBCConnect() {
    }

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            //注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            //打开连接
            System.out.println("打开数据库连接");
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

            //执行查询
            System.out.println("实例化Statement对象");
            String sql = "SELECT id, name FROM user where id=?";
            statement = connection.prepareStatement(sql);
            ((PreparedStatement) statement).setInt(1, 3);
            ResultSet resultSet = ((PreparedStatement) statement).executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("id : " + id + "; name : " + name);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }


}
