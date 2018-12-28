package com.yuan.cor;

import java.util.Random;

/**
 * 设计模式：责任链模式
 * 请求接收到之后，让该请求在一条链条上通过，直到该请求在某个处理类上被处理，
 * 链条上的每个环节都可以选择自行处理，或者让下一环节处理
 * 优点：实现请求和处理类的解耦，因为请求并不知道是哪个处理类处理了它的请求
 * 缺点：由于责任链模式的特性，往往在责任链中最终处理请求的只是链中的一个环节，
 * 其余几乎没什么作用，但服务器依然需要将其余环节这些对象创建出来，所以服务器的压力就变大了
 * <p>
 * 发送请求的类
 */
public class Test {

    private MyHandler myHandler;

    public void setMyHandler(MyHandler myHandler) {
        this.myHandler = myHandler;
    }

    public void sendRequest(float f) {
        myHandler.doHandler(f);
    }

    public static void main(String[] args) {
        Test request = new Test();
        request.setMyHandler(MyHandlerFactory.createHandler());
        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ":");
            request.sendRequest(random.nextFloat());
        }
    }

}
