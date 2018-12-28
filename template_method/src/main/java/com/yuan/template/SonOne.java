package com.yuan.template;

/**
 * 具体子类1
 */
public class SonOne extends Basic {

    @Override
    protected void stepTwo() {
        System.out.println("=====这里是SonOne实现的自由发挥的方法2=====");
    }

    @Override
    protected void stepFour() {
        System.out.println("=====这里是SonOne实现的自由发挥的方法4=====");
    }

}
