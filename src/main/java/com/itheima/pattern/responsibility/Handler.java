package com.itheima.pattern.responsibility;

/**
 * @version v1.0
 * @ClassName: Handler
 * @Description: 抽象处理者类
 * @Author: fyp
 * @data: 2021年 09月 16日 18:44
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    private int numStart;
    private int numEnd;

    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handleLeave(LeaveRequest leave);

    public final void submit(LeaveRequest leave){
        this.handleLeave(leave);
        if(this.nextHandler != null && leave.getNum() > this.numEnd){
            this.nextHandler.submit(leave);
        }else {
            System.out.println("流程结束!");
        }
    }

}
