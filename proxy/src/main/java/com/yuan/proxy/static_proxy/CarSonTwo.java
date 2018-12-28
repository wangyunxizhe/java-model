package com.yuan.proxy.static_proxy;

/**
 * 静态代理演示：该类为静态代理类，使用组合的方式实现了静态代理
 */
public class CarSonTwo implements Move {

    private Move move;

    public CarSonTwo(Move move) {
        this.move = move;
    }

    @Override
    public void move() {
        System.out.println("日志开始。。。");
        move.move();
        System.out.println("日志结束。。。");
    }

}
