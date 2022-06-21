package com.itheima.pattern.mediator;

/**
 * @version v1.0
 * @ClassName: Tenant
 * @Description: 具体同事类角色
 * @Author: fyp
 * @data: 2021年 09月 21日 14:44
 */
public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message){
        mediator.contact(message, this);
    }

    public void getMessage(String message){
        System.out.println("租房者" + name + "获取到的信息是：" + message);
    }
}
