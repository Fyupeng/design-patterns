package com.itheima.pattern.observer;

/**
 * @version v1.0
 * @ClassName: WeiXinUser
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 20日 22:55
 */
public class WeiXinUser implements Observer {

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("用户" + name + ": " + message);
    }
}
