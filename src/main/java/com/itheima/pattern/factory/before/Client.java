package com.itheima.pattern.factory.before;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 05日 21:00
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();

        Coffee coffee = store.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
