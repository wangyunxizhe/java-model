package com.yuan.proxy.jdk_proxy;

import com.yuan.proxy.static_proxy.Car;
import com.yuan.proxy.static_proxy.Move;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理测试类
 * 可以使用JDK动态代理的类：1，它是在运行时生成的class。
 * 2，该class需要实现一组interface。
 * 3，使用动态代理类时，必须实现InvocationHandler
 * 实现步骤：1，创建一个类（TimeHandler）去实现接口InvocationHandler，它必须实现invoke方法。
 * 2，创建被代理的类（Car）以及接口（Move）
 * 3，调用Proxy的newProxyInstance方法创建了一个代理类（m）
 * 4，通过代理调用方法（m.move()）
 */
public class JDKTest {

    public static void main(String[] args) {
        Car c = new Car();
        InvocationHandler h = new TimeHandler(c);//自定义的事件处理器
        //参数1：被代理类的类加载器。参数2：实现的接口。参数3：事件处理器
        Move m = (Move) Proxy.newProxyInstance(c.getClass().getClassLoader(), c.getClass().getInterfaces(), h);
        m.move();
    }

}
