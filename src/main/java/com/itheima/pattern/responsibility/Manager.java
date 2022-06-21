package com.itheima.pattern.responsibility;

/**
 * @version v1.0
 * @ClassName: Manager
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 18:58
 */
public class Manager extends Handler{

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent());
        System.out.println("部门经理审批：同意");
    }

}
