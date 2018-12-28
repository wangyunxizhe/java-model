package com.yuan.observer.example;

import com.yuan.observer.ConcreteSubject;

/**
 * 设计模式：观察者模式。该工程示例为拉模型
 * 优点：统一通知，分别处理
 * 两种实现方式：推模型和拉模型
 * 推模型：假定目标知道观察者需要的数据，主动向观察者推送数据
 * 拉模型：目标对象不知道观察者需要什么数据，因此把自身传递给观察者，由观察者来取值
 * 在拉模型模式中，由于观察者的update方法中传递的是目标对象自身，
 * 已经是可以传递的最大数据类型了，基本上可以应对各种情况
 */
public class Test {

    public static void main(String[] args) {
        //1,创建一个目标
        ConcreteSubject subject = new ConcreteSubject();
        //2，创建观察者
        ObserverExample example1 = new ObserverExample();
        example1.setObserverName("例子1");
        example1.setMyMsg("专属于例子1的消息");
        ObserverExample example2 = new ObserverExample();
        example2.setObserverName("例子2");
        example2.setMyMsg("专属于例子2的消息");
        //3，注册观察者
        subject.addObserve(example1);
        subject.addObserve(example2);
        //4，目标来发布一个消息
        subject.setSubjectState("由目标统一发出的一条消息");
    }

}
