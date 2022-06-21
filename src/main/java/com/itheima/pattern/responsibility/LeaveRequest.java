package com.itheima.pattern.responsibility;

/**
 * @version v1.0
 * @ClassName: LeaveRequest
 * @Description: 请假条类
 * @Author: fyp
 * @data: 2021年 09月 16日 18:43
 */
public class LeaveRequest {

    private String name;
    private int num;
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
