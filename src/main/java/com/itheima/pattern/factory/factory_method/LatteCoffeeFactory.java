package com.itheima.pattern.factory.factory_method;

/**
 * @version v1.0
 * @ClassName: LatteCoffeeFactory
 * @Description: 拿铁咖啡工厂
 * @Author: fyp
 * @data: 2021年 09月 06日 22:15
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
