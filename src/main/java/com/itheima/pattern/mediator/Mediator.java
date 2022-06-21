package com.itheima.pattern.mediator;

/**
 * @version v1.0
 * @ClassName: Mediator
 * @Description: 抽象中介类角色
 * @Author: fyp
 * @data: 2021年 09月 21日 14:41
 */
public abstract class Mediator {

    public abstract void contact(String message, Person person);
}
