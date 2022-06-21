package com.itheima.pattern.proxy.static_proxy;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 09日 19:51
 */
public class Client {
    public static void main(String[] args) {
        //创建对象
        ProxyPoint proxyPoint = new ProxyPoint();
        //调用方法进行买票
        proxyPoint.sell();
    }
}
