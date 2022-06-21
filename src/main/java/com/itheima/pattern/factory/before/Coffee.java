package com.itheima.pattern.factory.before;

import javax.swing.*;

/**
 * @version v1.0
 * @ClassName: Coffee
 * @Description: 咖啡类
 * @Author: fyp
 * @data: 2021年 09月 05日 20:51
 */
public abstract class Coffee {
    public abstract String getName();

    public void addSugar(){
        System.out.println("加糖");
    }

    public void addMilk(){
        System.out.println("加牛奶");
    }
}
