package com.yuan.strategy;

/**
 * 基类，抽象了所有相同的业务逻辑
 */
public abstract class Basic {

    //所有子类相同的业务方法
    public void same() {
        System.out.println("~~~基类中的通用方法~~~");
    }

    //由子类根据业务自定义实现的方法
    public abstract void zdy();

    /**
     * 在基类中加入策略接口
     */
    private MyStrategy myStrategy;

    public void setMyStrategy(MyStrategy myStrategy) {
        this.myStrategy = myStrategy;
    }

    public void add() {
        //在增加的方法中调用策略接口中的方法
        myStrategy.methodWithStrategy();
    }
}
