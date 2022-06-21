package com.itheima.pattern.singleton.demo3;

/**
 * @Version v1.0
 * @ClassName: Singleton
 * @Description: 线程安全
 * @Author: fyp
 * @data: 2021年 09月 05日 16:28
 */
public class Singleton {

    private Singleton(){

    }

    private static Singleton instance;

    public static synchronized Singleton getInstance(){
        if(instance == null){
            //并发的时候还是会出现多个实例,需使用synchronized,使得第二个访问处于线程等待
            instance = new Singleton();
        }
        return instance;
    }
}
