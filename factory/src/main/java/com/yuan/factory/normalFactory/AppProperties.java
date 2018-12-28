package com.yuan.factory.normalFactory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 读取normal.properties的类
 */
public class AppProperties {

    public Map<String, String> getProperties() {
        Properties props = new Properties();
        Map<String, String> map = new HashMap<>();
        try {
            InputStream in = getClass().getResourceAsStream("../../../../normal.properties");
            props.load(in);
            Enumeration en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = props.getProperty(key);
                map.put(key, property);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

}
