package com.itheima.pattern.proxy.cglib.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @version v1.0
 * @ClassName: ProxyFactory
 * @Description: 代理对象工厂，用来获取代理对象
 * @Author: fyp
 * @data: 2021年 09月 10日 8:47
 */
public class ProxyFactory implements MethodInterceptor {

    private  TrainStation station = new TrainStation();

    public TrainStation getProxyObject(){
        //获取Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();

        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代取点收取一定的代理服务费用（CGLib    动态代理）");
        //要调用目标对象的方法
        Object obj = method.invoke(station, objects);
        return obj;
    }
}
