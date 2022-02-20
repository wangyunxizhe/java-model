package com.yuan.template;

/**
 * 抽象基类，为所有子类提供一个算法框架
 * 实现要素：准备一个抽象类，将部分逻辑用具体方法在抽象类中实现，然后再声明一些抽象方法交由子类去实现剩余的逻辑。
 * 可以再加入钩子函数使子类在实现时具有更大灵活性。最后将这些方法汇总成一个不可改变的模板方法
 * 适用场景：1，操作遵循相似的逻辑。2，重构时（把相同代码抽取到父类）。3，重要、核心的逻辑可以设计为模板方法。
 */
public abstract class Basic {

    /**
     * 模板方法（本体）：禁止子类复写该方法
     * 封装了所有子类共同遵循的算法框架
     * 注意：该方法被final修饰，意味着不允许任何子类修改此方法，所有子类须遵照此模板中定义的流程去执行各自的逻辑
     */
    public final void prepareTemplate() {
        //1，步骤1
        stepOne();
        //2，步骤2
        stepTwo();
        //3，步骤3
        stepThree();
        //4，步骤4：如果子类需要就运行该步骤，不需要不运行
        if (isSonWants()) {
            stepFour();
        }
    }

    /**
     * 钩子方法：提供一个默认或空的实现，子类可以自行决定是否挂钩以及如何挂钩
     * 目的：使子类在实现上可以更灵活
     */
    protected boolean isSonWants() {
        return true;
    }

    /**
     * 基本方法一
     */
    private void stepOne() {
        System.out.println("~~~~~这里是Basic类的通用基本方法一~~~~~");
    }

    /**
     * 基本方法三
     */
    private void stepThree() {
        System.out.println("~~~~~这里是Basic类的通用基本方法三~~~~~");
    }

    /**
     * 留给子类自由发挥的方法2
     */
    protected abstract void stepTwo();

    /**
     * 留给子类自由发挥的方法4
     */
    protected abstract void stepFour();

}
