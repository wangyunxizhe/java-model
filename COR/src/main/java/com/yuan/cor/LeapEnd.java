package com.yuan.cor;

/**
 * 责任链最终层，高于55%的请求参数就拒绝
 */
public class LeapEnd extends MyHandler {

    @Override
    public void doHandler(float f) {
        if (f <= 0.55) {
            System.out.println(this.getClass().getName() + "批准了参数为：" + f + "的请求");
        } else {
            System.out.println(this.getClass().getName() + "拒绝了参数为：" + f + "的请求");
        }

    }

}
