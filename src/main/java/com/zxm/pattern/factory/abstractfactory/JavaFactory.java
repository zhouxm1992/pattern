package com.zxm.pattern.factory.abstractfactory;

public class JavaFactory implements ICourceFactory {

    public IRead startRead() {
        return new CRead();
    }

    public IStudy startStudy() {
        return new JavaStudy();
    }
}
