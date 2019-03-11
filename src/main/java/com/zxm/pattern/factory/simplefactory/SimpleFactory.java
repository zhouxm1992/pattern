package com.zxm.pattern.factory.simplefactory;

import com.zxm.pattern.factory.CCource;
import com.zxm.pattern.factory.ICource;
import com.zxm.pattern.factory.JavaCource;

public class SimpleFactory {

//public ICource create(String name){
//
//    ICource  cource = null;
//
//    if("java".equals(name)){
//
//        cource = new JavaCource();
//    } else if("c".equals(name)){
//
//        cource = new CCource();
//    }else {
//
//
//        cource = null;
//    }
//
//    return cource;
//
//}

//    public ICource create(String className) {
//
//        if(null != className && "".equals(className)){
//
//            try {
//
//                return (ICource) Class.forName(className).newInstance();
//            } catch (Exception e) {
//
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }

    public ICource create(Class<? extends ICource> clazz) {

        if (null != clazz) {
            try {
                return (ICource) clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

