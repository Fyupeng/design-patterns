package com.itheima.pattern.factory.simple_factory;


/**
 * @version v1.0
 * @ClassName: CoffeeStore
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 05日 20:56
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        Coffee coffee = factory.createCoffee(type);

        //加配料
        coffee.addSugar();
        coffee.addMilk();
        //
        return null;
    }
}
