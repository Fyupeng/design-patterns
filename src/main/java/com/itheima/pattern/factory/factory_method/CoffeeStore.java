package com.itheima.pattern.factory.factory_method;


import com.itheima.pattern.factory.static_factory.SimpleCoffeeFactory;

/**
 * @version v1.0
 * @ClassName: CoffeeStore
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 05日 20:56
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
