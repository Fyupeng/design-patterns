package com.itheima.pattern.decorator;

/**
 * @version v1.0
 * @ClassName: Egg
 * @Description: 鸡蛋类（装饰具体角色）
 * @Author: fyp
 * @data: 2021年 09月 12日 17:16
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    public float cost(){
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}

