package com.zxm.pattern.factory.simplefactory;

import com.zxm.pattern.factory.ICource;
import com.zxm.pattern.factory.JavaCource;

public class SimplateFactoryTest {

    public static void main(String[] args) {

//        ICource cource = new JavaCource();
//        cource.startStudy();

//        SimpleFactory simpleFactory = new SimpleFactory();
//        ICource javaCource = simpleFactory.create("com.zxm.pattern.factory.JavaCource");
//        javaCource.startStudy();
        SimpleFactory simpleFactory = new SimpleFactory();
        ICource javaCource = simpleFactory.create(JavaCource.class);
        javaCource.startStudy();
    }

}
