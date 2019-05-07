package com.zxm.pattern.singleton.threadlocal;

/**
 * 线程单例实现ThreadLocal.
 * ThreadLocal不能保证其创建的对象是全局唯一，但是能保证在单个线程中是唯一的
 * 天生的线程安全
 */
public class ThreadLocalSingleton {

    public ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){

        return threadLocalInstance.get();
    }
}
