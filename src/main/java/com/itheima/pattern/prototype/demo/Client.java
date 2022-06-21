package com.itheima.pattern.prototype.demo;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 08日 21:04
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();

        Realizetype clone = realizetype.clone();

        System.out.println("原型对象和克隆出来的对象是否是用一个对象：" + (realizetype == clone));
    }
}
