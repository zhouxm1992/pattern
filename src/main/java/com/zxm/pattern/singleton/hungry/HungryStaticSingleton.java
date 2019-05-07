package com.zxm.pattern.singleton.hungry;


public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    // 静态代码块机制
    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    public HungryStaticSingleton() {
    }

    public HungryStaticSingleton getInstance(){

        return hungryStaticSingleton;
    }
}
