package com.itheima.pattern.mediator;


/**
 * @version v1.0
 * @ClassName: Person
 * @Description: 抽象同事类角色
 * @Author: fyp
 * @data: 2021年 09月 21日 14:42
 */
public abstract class Person {

    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
