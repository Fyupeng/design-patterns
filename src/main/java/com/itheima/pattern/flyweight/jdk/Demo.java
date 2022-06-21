package com.itheima.pattern.flyweight.jdk;

/**
 * @version v1.0
 * @ClassName: Demo
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 15日 19:52
 */
public class Demo {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println(i1 == i2);

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println(i3 == i4);


    }
}
