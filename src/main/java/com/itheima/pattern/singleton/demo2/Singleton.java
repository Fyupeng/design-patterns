package com.itheima.pattern.singleton.demo2;

/**
 * @Version v1.0
 * @ClassName: Singleton
 * @Description: 静态代码块方式
 * @Author: fyp
 * @data: 2021年 09月 05日 16:28
 */
public class Singleton {
    //1. 私有构造方法
    private Singleton(){

    }

    //2. 声明Singleton类型的变量
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }

}
