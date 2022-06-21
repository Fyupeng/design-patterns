package com.itheima.pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @version v1.0
 * @ClassName: ProxyFactory
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 09日 20:01
 */
public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        //返回代理对象
        /**
         * (ClassLoader loader ：类加载器，用于加载代理类，可以通过目标对象获取类加载器
         * Class<?>[] interfaces ：代理类实现的接口的字节码对象
         * InvocationHandler h ：代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * @param o ： 代理对象，和ProxyObject对象是同一个对象，在invoke方法中基本不用
                     * @param method ： 对接口中的方法进行封装的method对象
                     * @param objects ： 调用方法的实际参数
                     * @return : 方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        //System.out.println("invoke方法执行了");
                        System.out.println("代取点收取一定的代理服务费用（jdk动态代理）");
                        //执行目标对象的方法
                        Object obj = method.invoke(station, objects);
                        return obj;
                    }
                }
        );

        return proxyObject;

    }
}
