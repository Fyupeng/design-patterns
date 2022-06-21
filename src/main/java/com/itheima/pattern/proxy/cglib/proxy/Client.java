package com.itheima.pattern.proxy.cglib.proxy;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 10日 9:02
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        //调用代理对象中的sell方法卖票
        proxyObject.sell();
    }
}
