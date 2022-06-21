package com.itheima.pattern.visitor;


/**
 * @version v1.0
 * @ClassName: Cat
 * @Description: 具体元素角色类
 * @Author: fyp
 * @data: 2021年 09月 23日 17:17
 */
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，喵喵喵...");
    }
}
