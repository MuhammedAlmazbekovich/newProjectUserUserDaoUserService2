package com.company;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.model.gender.Gender;
import com.company.service.impl.UserServiceImpl;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        UserDao userDao = new UserDao(userList);
        UserServiceImpl UsersService = new UserServiceImpl(userDao);

        User user1 = new User(1 , "Akaev", 67 , Gender.MALE);
        User user2 = new User(2 , "Bakiev", 65 , Gender.MALE);
        User user3 = new User(3 , "Otunbaeva", 62 , Gender.FEMALE);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        UsersService.addUser(new User(4,"Atambaev",66,Gender.MALE));

        System.out.println(UsersService.findUserById(1));
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(UsersService.getAllUsers());
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(UsersService.deleteUserById(2));
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(UsersService.getAllUsers());



    }
}
