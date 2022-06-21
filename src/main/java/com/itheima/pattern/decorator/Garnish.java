package com.itheima.pattern.decorator;

/**
 * @version v1.0
 * @ClassName: Garnish
 * @Description: 装饰抽象角色
 * @Author: fyp
 * @data: 2021年 09月 12日 17:13
 */
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
