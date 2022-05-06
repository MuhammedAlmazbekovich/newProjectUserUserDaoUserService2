package com.company.model;

import com.company.model.gender.Gender;

public class User {
    private Integer ID;
    private String name;
    private Integer age;
    private Gender gender;

    public User(Integer ID, String name, Integer age, Gender gender) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public User() {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User " + " ID= " + ID + ", name = " + name  + " , age = " + age + ", gender = " + gender ;
    }
}
