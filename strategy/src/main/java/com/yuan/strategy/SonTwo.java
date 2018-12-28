package com.yuan.strategy;

/**
 * 子类二
 */
public class SonTwo extends Basic {

    public SonTwo() {
        super.setMyStrategy(new MyStrategyImplOne());
    }

    @Override
    public void zdy() {
        System.out.println("====这里是子类二中实现的自定义方法====");
    }

}
