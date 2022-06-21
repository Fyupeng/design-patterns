package com.itheima.pattern.singleton.demo5;

/**
 * @Version v1.0
 * @ClassName: Singleton
 * @Description: 静态内部类方式
 * @Author: fyp
 * @data: 2021年 09月 05日 16:28
 */
public class Singleton {

    private Singleton(){

    }

    private static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
