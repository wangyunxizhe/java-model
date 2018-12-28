package com.yuan.factory.normalFactory;

import java.util.Map;

/**
 * 结合normal.properties定义的子类键值对信息，来创建子类对象
 */
public class MyFactory {

    public Father getClazzByClassKey(String propKey) {
        try {
            Map<String, String> map = new AppProperties().getProperties();
            Father myClass = (Father) Class.forName(map.get(propKey)).newInstance();
            return myClass;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
