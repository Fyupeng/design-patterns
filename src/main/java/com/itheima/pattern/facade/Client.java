package com.itheima.pattern.facade;

import com.sun.prism.impl.BaseMesh;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 14日 11:25
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();

        facade.say("打开家电");

        System.out.println("==============");

        facade.say("关闭家电");
    }
}
