package com.yuan.factory.abstractFactory;

/**
 * Created by wangy on 2018/12/19.
 */
public class MyFactoryTwoImpl implements MyFactory {

    @Override
    public FatherOne getOneF() {
        return new SonTwo();
    }

    @Override
    public FatherTwo getTwoF() {
        return new SonFour();
    }

}
