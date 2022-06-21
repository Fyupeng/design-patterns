package com.itheima.pattern.singleton.demo8;


import java.io.Serializable;

/**
 * @version v1.0
 * @ClassName: Singleton
 * @Description: 静态内部类方式
 * @Author: fyp
 * @data: 2021年 09月 05日 16:40
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    private Singleton(){
        synchronized (Singleton.class){
            //判断flag的值是否是true,如果是true,说明非第一次访问，直接抛一个异常，如果是false,说明是第一次访问，
            if(flag){
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
