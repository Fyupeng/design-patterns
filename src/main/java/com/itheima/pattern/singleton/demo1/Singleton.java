package com.itheima.pattern.singleton.demo1;

/**
 * @Version v1.0
 * @ClassName: Singleton
 * @Description: 静态变量方式
 * @Author: fyp
 * @data: 2021年 09月 05日 16:28
 */
public class Singleton {
    //1. 私有构造方法
    private Singleton(){

    }

    //2. 在本类中创建本类对象
    private static Singleton instance = new Singleton();

    //3. 获取单实例对象
    public static Singleton getInstance(){
        return instance;
    }

}
