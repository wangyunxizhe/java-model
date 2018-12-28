package com.yuan.strategy;

/**
 * 子类一
 */
public class SonOne extends Basic {

    public SonOne() {
        super.setMyStrategy(new MyStrategyImplOne());
    }

    @Override
    public void zdy() {
        System.out.println("====这里是子类一中实现的自定义方法====");
    }

}
