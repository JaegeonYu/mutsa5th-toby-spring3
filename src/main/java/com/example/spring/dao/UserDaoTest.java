package com.example.spring.dao;

import com.example.spring.domain.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionMaker connection = new NConnectionMaker();
        UserDao userDao = new UserDao(connection);

        User selectedUser = userDao.get("4");
        System.out.println(selectedUser.getId());
        System.out.println(selectedUser.getName());
        System.out.println(selectedUser.getPassword());
    }
}
