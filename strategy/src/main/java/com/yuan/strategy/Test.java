package com.yuan.strategy;

/**
 * 设计模式：策略模式
 * 策略模式设计原则：将应用中变化的部分独立出来，不和需要变化的代码部分混在一起
 * 使用场景：1，历史遗留项目中有许多相关的类如果仅仅是业务上的差异，可以将这些差异的共性提取出来作为策略接口。
 * 2，在需要使用很多ifelse此类条件语句时，可想办法用策略模式代替
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("~~~开始~~~");
        Basic f = null;
        f = new SonOne();
        f.same();
        f.zdy();
        f.add();
        System.out.println("*************************");
        f = new SonTwo();
        f.same();
        f.zdy();
        f.add();
        System.out.println("*************************");
        f = new SonThree();
        f.same();
        f.zdy();
        f.add();
        System.out.println("~~~结束~~~");
    }

}
