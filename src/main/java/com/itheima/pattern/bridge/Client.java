package com.itheima.pattern.bridge;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 14日 10:12
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystem system = new Mac(new AviFile());

        system.play("战狼3");
    }
}
