package com.itheima.pattern.visitor;

/**
 * @version v1.0
 * @ClassName: Owner
 * @Description: 具体访问者
 * @Author: fyp
 * @data: 2021年 09月 23日 17:22
 */
public class Owner implements Person{


    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食(>^ω^<)喵");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
