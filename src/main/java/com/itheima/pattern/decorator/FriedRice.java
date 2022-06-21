package com.itheima.pattern.decorator;

/**
 * @version v1.0
 * @ClassName: FriedRice
 * @Description: 炒饭（构件具体角色）
 * @Author: fyp
 * @data: 2021年 09月 12日 17:08
 */
public class FriedRice extends FastFood{

    public FriedRice(){
        super(10, "炒饭");
    }

    public float cost(){
        return getPrice();
    }
}
