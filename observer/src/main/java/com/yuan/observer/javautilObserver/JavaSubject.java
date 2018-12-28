package com.yuan.observer.javautilObserver;

import java.util.Observable;

/**
 * 利用JAVA.Util包中已经定义好的观察者接口来实现自己的观察者模式
 * <p>
 * 目标实现类
 */
public class JavaSubject extends Observable {

    //目标要发布的消息
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        //当设置完消息后，就通知所有观察者
        this.setChanged();//在进行通知前，在继承java定义Observable类中，此句必不可少
        //开始主动通知，这里先用“推”的方式，传递message参数
        this.notifyObservers(message);
        //如果是“拉”的方式，就不传参，将JavaSubject对象直接传过去
//        this.notifyObservers();
    }
}
