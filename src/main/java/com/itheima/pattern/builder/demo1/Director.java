package com.itheima.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassName: Director
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 09日 16:19
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
