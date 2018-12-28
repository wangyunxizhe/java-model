package com.yuan.observer.evo;

/**
 * 观察者接口
 */
public interface Observe {

    //当目标发生改变时调用
    public void update(EvoSubject subject);

    //设置观察者的名字
    public void setObserveName(String observeName);

    //获取观察者的名字
    public String getObserveName();

}
