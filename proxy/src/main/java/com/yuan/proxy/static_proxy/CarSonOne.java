package com.yuan.proxy.static_proxy;

/**
 * 静态代理演示：该类为静态代理类，使用继承的方式实现了静态代理
 */
public class CarSonOne extends Car {

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("模拟汽车开始行驶。。。");
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("汽车停止！行驶时间：" + (end - start) + "毫秒！");
    }
}
