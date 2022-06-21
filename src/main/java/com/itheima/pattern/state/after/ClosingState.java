package com.itheima.pattern.state.after;

/**
 * @version v1.0
 * @ClassName: LiftState
 * @Description: 电梯关闭状态
 * @Author: fyp
 * @data: 2021年 09月 16日 21:05
 */
public class ClosingState extends LiftState{

    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯关闭了");
    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

    }
}
