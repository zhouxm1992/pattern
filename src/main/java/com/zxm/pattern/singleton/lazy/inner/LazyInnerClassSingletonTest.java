package com.zxm.pattern.singleton.lazy.inner;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {

        try {
            Class<?> clazz = LazyInnerClassSingleton.class;

            // 通过反射拿到私有的构造方法
            Constructor constructor =clazz.getDeclaredConstructor(null);

            // 强制访问
            constructor.setAccessible(true);

            // 初始化两次，意味着new了两次
            Object c1 = constructor.newInstance();
            Object c2 = constructor.newInstance();

            // 结果为false,创建了两个实例
            System.out.println(c1 == c2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
