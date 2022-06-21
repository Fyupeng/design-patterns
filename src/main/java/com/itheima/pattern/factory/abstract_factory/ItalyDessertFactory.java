package com.itheima.pattern.factory.abstract_factory;

/**
 * @version v1.0
 * @ClassName: ItalyDessertFactory
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 07日 19:58
 */
public class ItalyDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
