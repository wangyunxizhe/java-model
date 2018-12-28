package com.yuan.observer.evo;

/**
 * 观察者模式的高阶应用，区别对待观察者
 */
public class Test {

    public static void main(String[] args) {
        //1,创建一个目标
        MySubject subject = new MySubject();
        //2，创建观察者
        MyObserver observer1 = new MyObserver();
        observer1.setObserveName("示例1");
        observer1.setMyMsg("示例1自己的消息");
        MyObserver observer2 = new MyObserver();
        observer2.setObserveName("示例2");
        observer2.setMyMsg("示例2自己的消息");
        //3，注册观察者
        subject.addObserve(observer1);
        subject.addObserve(observer2);
        //4，目标来发布一个消息
//        subject.setSubjectState("a");
        subject.setSubjectState("b");
    }

}
