package com.yuan.adapter;

/**
 * 方式二：类适配器类，通过继承的方式
 * 因为java的单继承规则，所以只能单一的为Two类进行转换。
 */
public class MyAdapterTwo extends Two implements Three {

    @Override
    public void methodWithThree() {
        System.out.println("=====通过类适配器进行转化=====");
        this.methodWithTwo();
    }

}
