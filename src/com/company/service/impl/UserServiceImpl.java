package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserServiceImpl implements UserService {
    static UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public int addUser(User user) {
        userDao.getUsers().add(user);


        return 0;
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getUsers();
    }


    @Override
    public boolean deleteUserById(Integer ID) {
        return userDao.getUsers().removeIf(mUser -> mUser.getID() == ID);
    }

    @Override
    public User findUserById  (Integer ID) {
        User user;
        List<User> userList = new ArrayList<>();
        user  = userDao.getUsers().stream().filter(x -> x.getID() == ID).findFirst().orElse(null);
        return user;
    }

}

