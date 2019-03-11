package com.zxm.pattern.factory.factorymethod;

import com.zxm.pattern.factory.CCource;
import com.zxm.pattern.factory.ICource;

public class CCourceFactory implements ICourceFactory {

    public ICource create() {
        return new CCource();
    }
}
