package com.yuan.observer;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 */
public class ConcreteSubject extends Subject {

    //目标对象的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        //调用set方法时，说明该目标一定发生了改变，在这里同时通知观察者，目标发生了改变
        this.notifyObserves();
    }
}
