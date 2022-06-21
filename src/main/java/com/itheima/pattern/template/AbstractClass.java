package com.itheima.pattern.template;

import javax.swing.*;

/**
 * @version v1.0
 * @ClassName: AbstractClass
 * @Description: 抽象类
 * @Author: fyp
 * @data: 2021年 09月 15日 20:48
 */
public abstract class AbstractClass {

    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }


    public void pourOil(){
        System.out.println("倒油");
    }

    public void heatOil(){
        System.out.println("热油");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry(){
        System.out.println("炒炒熟透了");
    }


}
