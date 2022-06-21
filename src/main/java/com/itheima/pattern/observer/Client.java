package com.itheima.pattern.observer;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 20日 22:56
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WeiXinUser("孙悟空"));
        subject.attach(new WeiXinUser("孙悟能"));
        subject.attach(new WeiXinUser("沙悟净"));

        subject.notify("黑马专栏更新了");

    }
}
