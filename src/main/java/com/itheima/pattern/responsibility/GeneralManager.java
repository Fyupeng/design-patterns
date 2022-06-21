package com.itheima.pattern.responsibility;

/**
 * @version v1.0
 * @ClassName: Manager
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 18:58
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(Handler.NUM_ONE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent());
        System.out.println("总经理审批：同意");
    }

}
