package com.itheima.pattern.factory.config_factory;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 07日 20:35
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());

        System.out.println("=========");

        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());

    }
}
