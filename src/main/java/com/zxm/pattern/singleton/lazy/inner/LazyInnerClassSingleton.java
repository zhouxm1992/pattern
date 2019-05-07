package com.zxm.pattern.singleton.lazy.inner;

/**
 * 静态内部类
 * 有点：解决了饿汉式的内存浪费以及同步的性能问题
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {

//        if(LazyHolder.Lazy != null){
//
//            throw new RuntimeException("不允许创建多个实例");
//
//
//        }
    }

    // static保证单例的空间共享
    public static LazyInnerClassSingleton getInstance() {

        return LazyHolder.Lazy;
    }

    // 默认不加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton Lazy = new LazyInnerClassSingleton();
    }
}
