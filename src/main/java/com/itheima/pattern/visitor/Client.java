package com.itheima.pattern.visitor;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 23日 17:26
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();

        home.add(new Dog());
        home.add(new Cat());

        Owner owner = new Owner();

        home.action(owner);

    }
}
