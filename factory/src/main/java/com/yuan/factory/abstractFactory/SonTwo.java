package com.yuan.factory.abstractFactory;

public class SonTwo implements FatherOne  {

    @Override
    public void fatherOneMethod() {
        System.out.println("-------实现“父接口1”的“子类2”实现类-------");
    }

}
