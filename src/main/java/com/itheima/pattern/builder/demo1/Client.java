package com.itheima.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 09日 16:21
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());

        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());


    }
}
