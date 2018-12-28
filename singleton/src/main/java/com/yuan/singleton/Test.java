package com.yuan.singleton;

/**
 * 懒汉VS饿汉
 * 饿汉模式加载类时比较慢，但在运行时获取对象的速度比较快，线程安全
 */
public class Test {

    public static void main(String[] args) {
        Hungry h1 = Hungry.getInstance();
        Hungry h2 = Hungry.getInstance();
        if (h1 == h2) {
            System.out.println("h1和h2是同一个对象");
        } else {
            System.out.println("h1和h2不是同一个对象");
        }

        Lazy l1 = Lazy.getInstance();
        Lazy l2 = Lazy.getInstance();
        if (l1 == l2) {
            System.out.println("l1和l2是同一个对象");
        } else {
            System.out.println("l1和l2不是同一个对象");
        }
    }

}
