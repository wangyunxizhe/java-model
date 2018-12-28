package com.yuan.factory.normalFactory;

public class SonOne implements Father {

    @Override
    public void fMethod() {
        System.out.println("--------“第一个”子实现类对父类方法的实现--------");
    }

}
