package com.itheima.pattern.decorator;

import java.util.Base64;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 12日 17:28
 */
public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();

        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("==============");

        food = new Egg(food);

        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("=============");

        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("=============");
        food = new Bacon(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");


    }
}
