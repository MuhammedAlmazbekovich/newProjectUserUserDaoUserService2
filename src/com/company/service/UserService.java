package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {

//    void addUser();

    int addUser(User user);

    List<User> getAllUsers();

    boolean deleteUserById(Integer ID);
    User findUserById (Integer ID);
}
