package com.itheima.pattern.responsibility;

/**
 * @version v1.0
 * @ClassName: GroupLeader
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 18:53
 */
public class GroupLeader extends Handler{

    public GroupLeader(){
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent());
        System.out.println("小组长审批：同意");
    }
}
