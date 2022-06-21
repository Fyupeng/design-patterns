package com.itheima.pattern.singleton.demo8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 测试使用反射破坏单例模式
 * @Author: fyp
 * @data: 2021年 09月 05日 16:45
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Class clazz = Singleton.class;
        Constructor cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
         Singleton s1 = (Singleton) cons.newInstance();
         Singleton s2 = (Singleton) cons.newInstance();

        System.out.println(s1 == s2);

    }




}
