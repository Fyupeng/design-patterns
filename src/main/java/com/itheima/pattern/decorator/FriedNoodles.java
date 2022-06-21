package com.itheima.pattern.decorator;

/**
 * @version v1.0
 * @ClassName: FriedNoddles
 * @Description: 炒面（构件具体角色）
 * @Author: fyp
 * @data: 2021年 09月 12日 17:10
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles(){
        super(10, "炒面");
    }

    public float cost(){
        return getPrice();
    }
}
