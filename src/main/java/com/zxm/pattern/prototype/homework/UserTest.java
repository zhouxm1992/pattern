package com.zxm.pattern.prototype.homework;

public class UserTest {

    public static void main(String[] args) {

        User user = new User();
        user.setUserName("yiyi");
        user.setPassWord("123456");
        user.setAge(19);

        try {
            // 浅克隆
            User user1 = user.clone();
            System.out.println(user1.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
