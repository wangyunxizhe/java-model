package com.yuan.singleton;

/**
 * 单例模式--懒汉式
 */
public class Lazy {

    //1，将构造方法私有化，不允许外部直接创建对象
    private Lazy() {

    }

    //2，声明一个实例，不创建
    private static Lazy instance;

    //3，向外提供一个获取实例的方法，为空才创建，不为空不创建
    public static Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }

}
