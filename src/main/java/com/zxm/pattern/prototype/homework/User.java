package com.zxm.pattern.prototype.homework;

import java.io.Serializable;

public class User implements Serializable, Cloneable {

    private String userName;
    private String passWord;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public User clone() throws CloneNotSupportedException {
        User user = new User();
        user.age = this.age;
        user.passWord = this.passWord;
        user.userName = this.userName;
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                '}';
    }
}
