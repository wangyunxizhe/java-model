package com.yuan.observer;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observe {

    //观察者的状态
    private String observeState;

    /**
     * 获取目标类的状态，同步到观察者的状态中
     *
     * @param subject 传入的目标对象，方便获取相应的目标对象的状态
     */
    @Override
    public void update(Subject subject) {
        observeState = ((ConcreteSubject) subject).getSubjectState();
    }

}
