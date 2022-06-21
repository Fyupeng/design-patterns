package com.itheima.pattern.decorator;

/**
 * @version v1.0
 * @ClassName: FastFood
 * @Description: 快餐类（构件抽象角色）
 * @Author: fyp
 * @data: 2021年 09月 12日 17:07
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}
