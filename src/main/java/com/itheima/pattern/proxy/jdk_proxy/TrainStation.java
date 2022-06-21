package com.itheima.pattern.proxy.jdk_proxy;

/**
 * @version v1.0
 * @ClassName: TrainStation
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 09日 19:45
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell(){
        System.out.println("火车站售票");
    }
}
