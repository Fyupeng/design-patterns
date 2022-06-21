package com.itheima.pattern.visitor;

/**
 * @version v1.0
 * @ClassName: Dog
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 23日 17:21
 */
public class Dog implements Animal{

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪...");
    }
}
