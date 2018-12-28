package com.yuan.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 该类用于方便去了解JDK的动态代理
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy  被代理的对象
     * @param method 被代理对象的方法
     * @param args   被代理对象方法的参数
     * @return 被代理对象方法的返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("模拟汽车开始行驶。。。");
        method.invoke(target);
        long end = System.currentTimeMillis();
        System.out.println("汽车停止！行驶时间：" + (end - start) + "毫秒！");
        return null;//因为需要反射执行的方法没有返回值，所以返回null就好
    }

}
