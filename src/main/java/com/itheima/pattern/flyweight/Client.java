package com.itheima.pattern.flyweight;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 15日 19:26
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        AbstractBox box2 = BoxFactory.getInstance().getShape("O");
        box2.display("绿色");

        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("白色");

        AbstractBox box4 = BoxFactory.getInstance().getShape("L");
        box4.display("红色");

        System.out.println("两次获取的O图形是否是同一个对象：" + (box2 == box3));

    }
}
