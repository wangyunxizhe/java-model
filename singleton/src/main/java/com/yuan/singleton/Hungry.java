package com.yuan.singleton;

/**
 * 单例模式--饿汉式
 */
public class Hungry {

    //1，将构造方法私有化，不允许外部直接创建对象
    private Hungry() {

    }

    //2，由自己来创建一个实例，也是唯一一个
    private static Hungry instance = new Hungry();

    //3，向外提供一个获取实例的方法
    public static Hungry getInstance() {
        return instance;
    }

}
