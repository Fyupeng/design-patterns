package com.itheima.pattern.visitor;

/**
 * @version v1.0
 * @ClassName: Animal
 * @Description: 抽象元素角色类
 * @Author: fyp
 * @data: 2021年 09月 23日 17:16
 */
public interface Animal {

    void accept(Person person);
}
