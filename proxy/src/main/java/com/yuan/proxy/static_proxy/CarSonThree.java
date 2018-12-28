package com.yuan.proxy.static_proxy;

/**
 * 静态代理演示：该类为静态代理类，使用组合的方式实现了静态代理
 */
public class CarSonThree implements Move {

    private Move move;

    public CarSonThree(Move move) {
        this.move = move;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("模拟汽车开始行驶。。。");
        move.move();
        long end = System.currentTimeMillis();
        System.out.println("汽车停止！行驶时间：" + (end - start) + "毫秒！");
    }

}
