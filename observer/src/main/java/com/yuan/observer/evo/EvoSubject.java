package com.yuan.observer.evo;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标
 */
public abstract class EvoSubject {

    //用来保存注册的观察者对象
    protected List<Observe> observes = new ArrayList<>();

    //向集合中添加观察者
    public void addObserve(Observe observe) {
        observes.add(observe);
    }

    //删除集合中的指定观察者
    public void delObserve(Observe observe) {
        observes.remove(observe);
    }

    //如果要区别对待观察者，这个方法就必须让子类自己去实现
    protected abstract void notifyObserves();

}
