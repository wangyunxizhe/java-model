package com.yuan.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象类，它知道正在观察它的观察者，并提供添加和删除观察者的接口
 */
public class Subject {

    //用来保存注册的观察者对象
    private List<Observe> observes = new ArrayList<>();

    //向集合中添加观察者
    public void addObserve(Observe observe) {
        observes.add(observe);
    }

    //删除集合中的指定观察者
    public void delObserve(Observe observe) {
        observes.remove(observe);
    }

    //向所有集合中的观察者发送通知
    protected void notifyObserves() {
        for (Observe observe : observes) {
            observe.update(this);
        }
    }

}
