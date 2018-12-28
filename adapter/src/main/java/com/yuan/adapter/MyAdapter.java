package com.yuan.adapter;

/**
 * 方式一：对象适配器类，通过和需要适配的类组合的方式，组合方式更加灵活。
 * 组合的官方解释：在类中增加一个私有域，引用另一个已有的类的实例，
 * 通过调用引用实例的方法从而获得新的功能，这种设计被称作组合（复合）。
 * 在这里好比是转换接头
 */
public class MyAdapter implements Three {

    private Two two;

    public MyAdapter(Two two) {
        this.two = two;
    }

    @Override
    public void methodWithThree() {
        System.out.println("=====通过对象适配器进行转化=====");
        two.methodWithTwo();
    }

}
