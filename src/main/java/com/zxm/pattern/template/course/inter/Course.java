package com.zxm.pattern.template.course.inter;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 一个模板会有一个或多个未实现的方法
 * 而且这几个未实现方法有固定的执行顺序
 */
public interface  Course {

    default void createCource() {

        // 1.发布预习资料
        this.postPreResource();

        // 2.制作PPT
        this.createPPT();

        // 3.直播
        this.liveRadio();

        // 4.提交课件笔记
        this.postNote();

        // 5.提交源码
        this.postResource();

        // 6.布置作业
        if(needHomework()){

            checkHomework();
        }

    }

     void checkHomework();

     // 钩子方法：实现流程微雕
     boolean needHomework();

     void postResource();

     void postNote();

     void liveRadio();

     void createPPT();

     void postPreResource();
}
