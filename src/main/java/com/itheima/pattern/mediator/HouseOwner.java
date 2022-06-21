package com.itheima.pattern.mediator;

/**
 * @version v1.0
 * @ClassName: HouseOwner
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 21日 14:48
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message){
        mediator.contact(message, this);
    }

    public void getMessage(String message){
        System.out.println("房主" + name + "获取到的信息是:" + message);
    }

}
