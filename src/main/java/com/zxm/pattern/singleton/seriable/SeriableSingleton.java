package com.zxm.pattern.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    public SeriableSingleton() {
    }

    public final  static SeriableSingleton INSTANCE = new SeriableSingleton();

    public static SeriableSingleton getInstance(){

        return  INSTANCE;
    }
}
