package com.company.dao;

import com.company.model.User;

import java.util.List;

public class UserDao {
    public List<User> users;

    public UserDao(List<User> users) {
        this.users = users;
    }
}
