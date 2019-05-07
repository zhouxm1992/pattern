package com.zxm.pattern.singleton.lazy;

public class LazyCheckSingleton {

    public LazyCheckSingleton() {
    }

    private static LazyCheckSingleton lazyCheckSingleton = null;

    public synchronized static LazyCheckSingleton getInstance() {

        if(lazyCheckSingleton == null){
            lazyCheckSingleton = new LazyCheckSingleton();
        }
        return lazyCheckSingleton;
    }
}
