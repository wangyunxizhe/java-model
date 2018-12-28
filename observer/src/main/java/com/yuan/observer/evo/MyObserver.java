package com.yuan.observer.evo;

/**
 * Created by wangy on 2018/12/21.
 */
public class MyObserver implements Observe {

    private String observeName;

    //目标对象发布的消息
    private String normalMsg;

    //观察者自己的消息
    private String myMsg;

    @Override
    public void update(EvoSubject subject) {
        normalMsg = ((MySubject) subject).getSubjectState();
        System.out.println(observeName + "收到了" + normalMsg + "，" + myMsg);
    }

    @Override
    public void setObserveName(String observeName) {
        this.observeName = observeName;
    }

    @Override
    public String getObserveName() {
        return observeName;
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
}
