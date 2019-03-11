package com.zxm.pattern.factory.abstractfactory;

public class AbstractFactory {

    public static void main(String[] args) {

        ICourceFactory  javaFactory  = new JavaFactory();
        javaFactory.startRead().read();
        javaFactory.startStudy().study();
    }
}
