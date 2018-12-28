package com.yuan.factory.normalFactory;

public class SonTwo implements Father {

    @Override
    public void fMethod() {
        System.out.println("~~~~~~~~~“第二个”子实现类对父类方法的实现~~~~~~~~~");
    }

}
