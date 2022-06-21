package com.itheima.pattern.strategy;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 10:11
 */
public class Client {
    public static void main(String[] args) {
        SalesMan man1 = new SalesMan(new StrategyA());
        man1.salesManShow();

        SalesMan man2 = new SalesMan(new StrategyB());
        man2.salesManShow();

        SalesMan man3 = new SalesMan(new StrategyC());
        man3.salesManShow();
    }
}
