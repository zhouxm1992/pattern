package com.zxm.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {

    public LazyDoubleCheckSingleton() {
    }

   // volatile的作用是作为指令关键字，确保本条指令不会因编译器的优化而省略
    private volatile static LazyDoubleCheckSingleton lazy = null;

    public synchronized static LazyDoubleCheckSingleton getInstance() {

        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){

                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }

        }
        return lazy;
    }
}
