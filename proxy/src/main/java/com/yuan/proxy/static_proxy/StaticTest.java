package com.yuan.proxy.static_proxy;

/**
 * 设计模式：代理模式之静态代理
 * 从比较来看，组合的方式比继承更加灵活，因为组合方式，代理之间可以自由选择性注入。而继承方式比较固定
 */
public class StaticTest {

    public static void main(String[] args) {
        Move cs1 = new CarSonOne();
        cs1.move();
        System.out.println("****************************");
        Car c = new Car();
        CarSonTwo cs2 = new CarSonTwo(c);
        CarSonThree cs3 = new CarSonThree(cs2);
        cs3.move();
    }

}
