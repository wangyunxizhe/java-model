package com.yuan.factory.abstractFactory;

/**
 * Created by wangy on 2018/12/19.
 */
public class MyFactoryOneImpl implements MyFactory {

    @Override
    public FatherOne getOneF() {
        return new SonOne();
    }

    @Override
    public FatherTwo getTwoF() {
        return new SonThree();
    }

}
