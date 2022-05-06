package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {

//    void addUser();

    void addUser(User user);

    List<User> getAllUsers();

    Boolean deleteUserById(Integer ID);
    User findUserById (Integer ID);
}
