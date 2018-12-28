package com.yuan.cor;

public class LeapFour extends MyHandler {

    @Override
    public void doHandler(float f) {
        if (f <= 0.4) {
            System.out.println(this.getClass().getName() + "批准了参数为：" + f + "的请求");
        } else {
            successor.doHandler(f);
        }

    }

}
