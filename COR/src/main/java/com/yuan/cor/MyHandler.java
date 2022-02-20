package com.yuan.cor;

/**
 * 责任链核心类：请求处理类，负责处理用户请求
 */
public abstract class MyHandler {

    /**
     * 直接后继，用于传递请求
     * 选择protected关键字修饰，可以让子类都能访问到successor
     */
    protected MyHandler successor;

    public void setSuccessor(MyHandler successor) {
        this.successor = successor;
    }

    /**
     * 责任链模式的核心方法：处理请求的方法
     *
     * @param f 传入请求期望得到的结果，这里以float类型为例
     */
    public abstract void doHandler(float f);

}
