package com.yuan.cor;

/**
 * 责任链最底层类，可以满足传来参数f低于5%以内的请求，如果f高于5%，则去责任链的第二层
 */
public class LeapOne extends MyHandler {

    @Override
    public void doHandler(float f) {
        if (f <= 0.05) {
            System.out.println(this.getClass().getName() + "批准了参数为：" + f + "的请求");
        } else {
            //在该类无权处理该请求时，让他的直接后续处理这个请求
            successor.doHandler(f);
        }
    }

}
