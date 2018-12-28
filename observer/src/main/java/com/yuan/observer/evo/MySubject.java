package com.yuan.observer.evo;

/**
 * 目标实现类
 */
public class MySubject extends EvoSubject {

    //目标对象的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObserves();
    }

    @Override
    protected void notifyObserves() {
        //循环所有注册的观察者
        for (Observe observe : observes) {
            //通知规则：示例1要“b”条件时通知，其他条件时不通知；示例2要“a”和“b”条件时通知，其他不通知
            if ("b".equals(this.getSubjectState())) {
                if ("示例1".equals(observe.getObserveName())) {
                    observe.update(this);
                }
                if ("示例2".equals(observe.getObserveName())) {
                    observe.update(this);
                }
            }
            if ("a".equals(this.getSubjectState())) {
                if ("示例2".equals(observe.getObserveName())) {
                    observe.update(this);
                }
            }
        }
    }

}
