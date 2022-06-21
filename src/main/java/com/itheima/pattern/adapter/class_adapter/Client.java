package com.itheima.pattern.adapter.class_adapter;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 客户端
 * @Author: fyp
 * @data: 2021年 09月 10日 15:51
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("====================");

        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);

    }

}
