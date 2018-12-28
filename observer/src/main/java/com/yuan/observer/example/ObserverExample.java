package com.yuan.observer.example;

import com.yuan.observer.ConcreteSubject;
import com.yuan.observer.Observe;
import com.yuan.observer.Subject;

/**
 * 这是一个观察者的例子，对ConcreteObserver的现实应用，模拟现实中的业务
 */
public class ObserverExample implements Observe {

    //观察者的名字：是谁收到了这个消息
    private String observerName;

    //要发送的消息，这个消息从目标那里获取到
    private String normalMsg;

    //对不同的观察者，具体提醒的不同内容
    private String myMsg;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getNormalMsg() {
        return normalMsg;
    }

    public void setNormalMsg(String normalMsg) {
        this.normalMsg = normalMsg;
    }

    public String getMyMsg() {
        return myMsg;
    }

    public void setMyMsg(String myMsg) {
        this.myMsg = myMsg;
    }

    @Override
    public void update(Subject subject) {
        normalMsg = ((ConcreteSubject) subject).getSubjectState();
        System.out.println(observerName + "收到了" + normalMsg + "，" + myMsg);
    }

}
