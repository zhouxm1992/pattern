package com.zxm.pattern.factory.factorymethod;

import com.zxm.pattern.factory.ICource;
import com.zxm.pattern.factory.JavaCource;

public class JavaFactory implements ICourceFactory {

    public ICource create() {
        return new JavaCource();
    }
}
