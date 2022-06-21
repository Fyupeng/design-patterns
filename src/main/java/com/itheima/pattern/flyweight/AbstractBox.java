package com.itheima.pattern.flyweight;

/**
 * @version v1.0
 * @ClassName: AbstractBox
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 15日 19:18
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状：" + getShape() + "，颜色：" + color);
    }
}
