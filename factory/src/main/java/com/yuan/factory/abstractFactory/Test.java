package com.yuan.factory.abstractFactory;

/**
 * 抽象工厂模式
 *
 * 工厂方法模式和抽象工厂模式对比
 * 1，工厂模式是一种极端情况的抽象工厂模式，而抽象工厂模式可以看成是工厂模式的推广
 * 2，工厂模式用来创建一个产品的等级结构，而抽象工厂模式是用来创建多个产品的等级结构
 * 3，工厂模式只有一个抽象产品类，而抽象工厂模式有多个抽象产品类
 */
public class Test {

    public static void main(String[] args) {
        //需要实现“父接口1”的“子类1”实现类
        MyFactory factory = new MyFactoryOneImpl();
        FatherOne s1 = factory.getOneF();
        s1.fatherOneMethod();
        //需要实现“父接口2”的“子类2”实现类
        MyFactory factory1 = new MyFactoryTwoImpl();
        FatherTwo s4 = factory1.getTwoF();
        s4.fatherTwoMethod();
    }

}
