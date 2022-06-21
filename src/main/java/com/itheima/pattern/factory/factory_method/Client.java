package com.itheima.pattern.factory.factory_method;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 测试类
 * @Author: fyp
 * @data: 2021年 09月 06日 22:31
 */
public class Client {

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        //AmericanCoffeeFactory factory = new AmericanCoffeeFactory();
        LatteCoffeeFactory factory = new LatteCoffeeFactory();

        store.setFactory(factory);

        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }

}
