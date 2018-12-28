package com.yuan.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wangy on 2018/12/14.
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        //为需要的类来创建代理类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();//创建代理类
    }

    /**
     * 拦截所有目标类方法的调用
     *
     * @param o           目标类的实例
     * @param method      需要反射的目标方法
     * @param objects     目标方法的参数
     * @param methodProxy 代理类的实例
     * @return
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("~~~~~~代理类来完成的业务开始~~~~~~");
        //调用被代理类的方法
        methodProxy.invokeSuper(o, objects);
        System.out.println("~~~~~~代理类来完成的业务结束~~~~~~");
        return null;
    }

}
