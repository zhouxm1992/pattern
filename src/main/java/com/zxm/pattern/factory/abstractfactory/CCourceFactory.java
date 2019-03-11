package com.zxm.pattern.factory.abstractfactory;

public class CCourceFactory implements ICourceFactory {

    public IRead startRead() {
        return new CRead();
    }

    public IStudy startStudy() {
        return new CStudy();
    }
}
