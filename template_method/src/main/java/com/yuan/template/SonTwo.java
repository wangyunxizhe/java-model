package com.yuan.template;

/**
 * 具体子类2
 */
public class SonTwo extends Basic {

    @Override
    protected void stepTwo() {
        System.out.println("=====这里是SonTwo实现的自由发挥的方法2=====");
    }

    @Override
    protected void stepFour() {
        System.out.println("=====这里是SonTwo实现的自由发挥的方法4=====");
    }

    /**
     * 该子类选择实现基类的“钩子方法”，这里体现的效果就是不用执行步骤4
     */
    @Override
    protected boolean isSonWants() {
        return false;
    }
}
