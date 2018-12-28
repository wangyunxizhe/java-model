package com.yuan.adapter;

/**
 * 设计模式：适配器模式
 * 例子：假设用笔记本电脑充电来举例。Test类好比用三脚插头充电的笔记本电脑，现在要放在两眼的插座上充电。
 * Three类好比三脚插头，Two类好比两眼插座，MyAdapter，MyAdapterTwo类好比是转换接头，分别代表实现适配器模式的两种方式。
 * 原理：把需要适配的类作为一个对象，组合到适配器类中，以修改目标接口包装被适配者，
 * 这种采用组合的方式被称为“对象”适配器。
 * 还有通过继承的方式适配的“类”适配器
 */
public class Test {

    private Three three;

    public Test(Three three) {
        this.three = three;
    }

    //模拟使用三眼插座充电
    public void change() {
        three.methodWithThree();
    }

    public static void main(String[] args) {
        System.out.println("方式一：");
        Two two = new Two();
        Three three = new MyAdapter(two);
        Test t = new Test(three);
        t.change();
        System.out.println("方式二：");
        three = new MyAdapterTwo();
        t = new Test(three);
        t.change();
    }

}
