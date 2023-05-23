package com.example.spring;

import java.sql.*;

public class Db {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/spring-db", "root", "1q2w3e4r"
        );

        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery("show databases ");
        while(rs.next()){
            String str = rs.getString(1);
            System.out.println(str);
        }

        rs.close();
        rs.close();
        c.close();
    }
}
