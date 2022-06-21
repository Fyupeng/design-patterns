package com.itheima.pattern.strategy;

/**
 * @version v1.0
 * @ClassName: StrategyA
 * @Description: 具体策略类，用来封装算法
 * @Author: fyp
 * @data: 2021年 09月 16日 10:07
 */
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("满1000免费换购200以下商品");
    }
}
