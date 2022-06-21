package com.itheima.pattern.proxy.static_proxy;

/**
 * @version v1.0
 * @ClassName: ProxyPoint
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 09日 19:48
 */
public class ProxyPoint implements SellTickets {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell(){
        System.out.println("代理点收取一些服务费用");
        trainStation.sell();
    }
}
