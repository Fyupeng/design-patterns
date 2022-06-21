package com.itheima.pattern.singleton.demo7;


import java.io.Serializable;

/**
 * @version v1.0
 * @ClassName: Singleton
 * @Description: 静态内部类方式
 * @Author: fyp
 * @data: 2021年 09月 05日 16:40
 */
public class Singleton implements Serializable {

    private Singleton(){

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }


    //当进行反序列化时，会自动调用该方法，将该方法的返回值直接放回
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
