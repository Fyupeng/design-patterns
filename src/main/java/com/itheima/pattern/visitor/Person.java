package com.itheima.pattern.visitor;

/**
 * @version v1.0
 * @ClassName: Peron
 * @Description: 抽象访问者
 * @Author: fyp
 * @data: 2021年 09月 23日 17:16
 */
public interface Person {

    void feed(Cat cat);

    void feed(Dog dog);
}
