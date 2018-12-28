package com.yuan.template;

/**
 * 设计模式：模板方法模式
 * 适合场景：操作遵循相似的逻辑，需要把相同的代码提取到父类中
 * 优点：封装性好，复用性好，屏蔽细节，便于维护
 * 缺点：需要继承，因为java是单继承，所以就成了缺点
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("调用SonOne");
        Basic b1 = new SonOne();
        b1.prepareTemplate();
        System.out.println("SonOne调用完毕");
        System.out.println("调用SonTwo");
        Basic b2 = new SonTwo();
        b2.prepareTemplate();
        System.out.println("SonTwo调用完毕");
    }

}
