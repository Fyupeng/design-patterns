package com.itheima.pattern.factory.abstract_factory;

/**
 * @version v1.0
 * @ClassName: AmericanDessertFactory
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 07日 19:28
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
