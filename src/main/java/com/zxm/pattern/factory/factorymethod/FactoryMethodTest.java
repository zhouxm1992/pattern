package com.zxm.pattern.factory.factorymethod;

import com.zxm.pattern.factory.ICource;
import com.zxm.pattern.factory.JavaCource;

public class FactoryMethodTest {

    public static void main(String[] args) {

        JavaFactory javaFactory = new JavaFactory();
        ICource javaCource = javaFactory.create();
        javaCource.startStudy();
    }
}
