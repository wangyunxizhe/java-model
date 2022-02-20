package com.yuan.cor;

/**
 * Created by wangy on 2018/12/20.
 */
public class MyHandlerFactory {

    /**
     * 这里可以运用工厂模式来构建整个责任链的执行顺序
     */
    public static MyHandler createHandler() {
        MyHandler leap1 = new LeapOne();
        MyHandler leap2 = new LeapTwo();
        MyHandler leap3 = new LeapThree();
        MyHandler leap4 = new LeapFour();
        MyHandler leap5 = new LeapFive();
        MyHandler leap6 = new LeapEnd();
        //指定每个阶段的直接后继
        leap1.setSuccessor(leap2);
        leap2.setSuccessor(leap3);
        leap3.setSuccessor(leap4);
        leap4.setSuccessor(leap5);
        leap5.setSuccessor(leap6);
        //返回请求到达的第一层
        return leap1;
    }

}
