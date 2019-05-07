package com.zxm.pattern.singleton.hungry;

/**
 * 饿汉式单例
 */
public class HungrySingleton{

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public HungrySingleton() {
    }

    public HungrySingleton getInstance(){

        return  hungrySingleton;
    }
}
