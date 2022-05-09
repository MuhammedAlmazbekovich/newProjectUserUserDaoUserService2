package com.company.dao;

import com.company.model.User;

import java.util.List;

public class UserDao {
    private List<User> users;

    public UserDao(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
