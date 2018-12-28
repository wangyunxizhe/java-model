package com.yuan.observer.javautilObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 利用JAVA.Util包中已经定义好的观察者接口来实现自己的观察者模式
 * <p>
 * 观察者实现类
 */
public class JavaObserver implements Observer {

    //观察者名称
    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(Observable o, Object arg) {
        //“推”的方式
        System.out.println(observerName + "收到了消息，目标推送过来的是：" + arg);
        //“拉”的方式
        System.out.println(observerName + "收到了消息，主动到目标对象中去拉，拉的内容是："
                + ((JavaSubject) o).getMessage());
    }

}
