package com.itheima.pattern.template;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 15日 22:09
 */
public class Client {
    public static void main(String[] args) {
        ConcreteClass_BaoCai baocai = new ConcreteClass_BaoCai();

        baocai.cookProcess();
    }
}
