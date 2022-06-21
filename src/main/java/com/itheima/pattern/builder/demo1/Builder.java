package com.itheima.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassName: Builder
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 09日 16:12
 */
public abstract class Builder {

    //声明Bike类的变量并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
