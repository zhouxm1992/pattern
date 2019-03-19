package com.zxm.pattern.template.course.inter;

public class JavaCource implements Course {

    private boolean needHomeworkFlag = false;

    public JavaCource(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    public boolean needHomework() {
        return this.needHomeworkFlag;
    }

    @Override
    public void postResource() {

        System.out.println("提交源码");
    }

    @Override
    public void postNote() {
        System.out.println("提交课件，笔记");
    }

    @Override
    public void liveRadio() {

        System.out.println("课堂直播");
    }

    @Override
    public void createPPT() {

        System.out.println("制作PPT");
    }

    @Override
    public void postPreResource() {

        System.out.println("发布预习资料");
    }

    public void checkHomework() {
        System.out.println("检查java的架构课件");
    }
}
