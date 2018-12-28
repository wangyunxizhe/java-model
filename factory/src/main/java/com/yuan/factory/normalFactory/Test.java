package com.yuan.factory.normalFactory;

/**
 * 设计模式：工厂模式
 * 设计前提：Father类为基类接口类，分别由不同子类完成了不同的实现，根据需求获取适合的子类
 * 设计思路：将不同子类按照“简称=类的全路径”这种键值对的方式写在normal.properties中，
 * 由AppProperties去读取里面的信息，并保存在Map中。工厂类（MyFactory）获取到传来的简称（Map中的key），
 * 再根据简称读取Map中对应的子类全路径，并将该子类实例化后返回。
 * 优点：如果有新的实现需求，只需建立新的子类实现，然后将新的子类，
 * 以“简称=类的全路径”继续追加在normal.properties中，在向工厂要新的对象时，只需传入新的简称即可。
 * <p>
 * 例子：1，JDBC的第一步代码运用的就是这种模式。2，springIOC的BeanFactory
 */
public class Test {

    public static void main(String[] args) {
        MyFactory factory = new MyFactory();
        Father clazz1 = factory.getClazzByClassKey("one");
        clazz1.fMethod();
    }

}
