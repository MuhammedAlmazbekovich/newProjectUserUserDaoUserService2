package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UserServiceImpl implements UserService {
    static UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void addUser(User user) {
        userDao.users.add(user);

    }


    @Override
    public List<User> getAllUsers() {
        return userDao.users;
    }


    @Override
    public Boolean deleteUserById(Integer ID) {
        return userDao.users.removeIf(mUser -> mUser.getID() == ID);
    }

    @Override
    public User findUserById(Integer ID) {
        User user = new User();
        for (User newUser : userDao.users) {
            try {
                if (newUser.getID() == ID) {
                    user = newUser;
                } else {
                    throw new RuntimeException();
                }

            }catch (RuntimeException E){

            }
        }
        System.out.println("User with ID = " + ID + " was not found");

        return user;
    }
}