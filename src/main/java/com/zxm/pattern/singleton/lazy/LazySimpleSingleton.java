package com.zxm.pattern.singleton.lazy;

/**
 * 懒汉式单例
 */
public class LazySimpleSingleton {
    public LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazy = null;

    public static LazySimpleSingleton getInstance(){

        if(lazy == null){

            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
