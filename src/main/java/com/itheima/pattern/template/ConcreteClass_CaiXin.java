package com.itheima.pattern.template;

/**
 * @version v1.0
 * @ClassName: ConcreteClass_BaoCai
 * @Description: 菜心
 * @Author: fyp
 * @data: 2021年 09月 15日 22:08
 */
public class ConcreteClass_CaiXin extends AbstractClass{

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
