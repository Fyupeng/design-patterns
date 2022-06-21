package com.itheima.pattern.responsibility;

import java.lang.management.ManagementFactory;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 19:01
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leave = new LeaveRequest("小明", 3, "身体不适");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        manager.setNextHandler(generalManager);
        groupLeader.setNextHandler(manager);

        groupLeader.submit(leave);

    }
}
