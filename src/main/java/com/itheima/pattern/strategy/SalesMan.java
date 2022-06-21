package com.itheima.pattern.strategy;

/**
 * @version v1.0
 * @ClassName: SalesMan
 * @Description: 促销员
 * @Author: fyp
 * @data: 2021年 09月 16日 10:09
 */
public class SalesMan {

    private Strategy strategy;

    public SalesMan(Strategy strategy){
        this.strategy = strategy;
    }

    public void salesManShow(){
        strategy.show();
    }

}
