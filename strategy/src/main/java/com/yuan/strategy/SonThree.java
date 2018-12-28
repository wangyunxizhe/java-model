package com.yuan.strategy;

/**
 * 子类三
 * 注意：这里接入的是策略接口实现类二
 */
public class SonThree extends Basic {

    public SonThree() {
        super.setMyStrategy(new MyStrategyImplTwo());
    }

    @Override
    public void zdy() {
        System.out.println("====这里是子类三中实现的自定义方法====");
    }

    @Override
    public void same() {
        System.out.println("----这里是子类三中复写的基类中的通用方法----");
    }
}
