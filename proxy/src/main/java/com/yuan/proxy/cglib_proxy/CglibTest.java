package com.yuan.proxy.cglib_proxy;

/**
 * Created by wangy on 2018/12/14.
 */
public class CglibTest {

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Train t = (Train) proxy.getProxy(Train.class);
        t.move();
    }

}
