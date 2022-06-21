package com.itheima.pattern.proxy.jdk_proxy;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 09日 20:16
 */
public class Client {
    public static void main(String[] args) {
        //1.创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2.使用factory获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        //3.调用卖票的方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        while (true){

        }

    }
}
