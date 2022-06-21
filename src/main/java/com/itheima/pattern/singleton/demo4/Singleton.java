package com.itheima.pattern.singleton.demo4;

/**
 * @Version v1.0
 * @ClassName: Singleton
 * @Description: 双重检查锁方式
 * @Author: fyp
 * @data: 2021年 09月 05日 16:28
 */
public class Singleton {

    private Singleton(){

    }

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
