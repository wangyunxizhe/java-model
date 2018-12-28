package com.yuan.proxy.static_proxy;

import java.util.Random;

/**
 * 静态代理演示：模拟一个汽车实现了Move这个行为
 */
public class Car implements Move {

    @Override
    public void move() {
        try {
            //模拟车正在开
            System.out.println("车正在开~~~");
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
