package com.itheima.pattern.flyweight;

import javax.swing.*;
import java.util.HashMap;

/**
 * @version v1.0
 * @ClassName: BoxFactory
 * @Description: 工厂类，将该类设计为单例
 * @Author: fyp
 * @data: 2021年 09月 15日 19:22
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    private BoxFactory(){
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    public static BoxFactory getInstance(){
        return factory;
    }

    private static BoxFactory factory = new BoxFactory();

    public AbstractBox getShape(String name){
        return map.get(name);
    }

}
