package com.yuan.observer.javautilObserver;

/**
 * 利用JAVA.Util包中已经定义好的观察者接口来实现自己的观察者模式
 * <p>
 * 在以下情况中可以选用观察者模式：
 * 1，当一个抽象模型有两个方面，其中一个方面的操作依赖于另一个方面的状态变化
 * 2，如果在更改一个对象的时候，需要同时连带改变其他的对象，而且不知道究竟应该有多少对象需要被连带改变
 * 3，当一个对象必须通知其他的对象，但又希望这个对象和其他被它通知的对象是松耦合的
 */
public class Test {

    public static void main(String[] args) {
        //创建一个目标
        JavaSubject subject = new JavaSubject();
        //创建观察者
        JavaObserver example1 = new JavaObserver();
        example1.setObserverName("示例1");
        JavaObserver example2 = new JavaObserver();
        example2.setObserverName("示例2");
        //3，注册观察者
        subject.addObserver(example1);
        subject.addObserver(example2);
        //4，目标来发布一条消息
        subject.setMessage("目标统一发布了一条消息");
    }

}
