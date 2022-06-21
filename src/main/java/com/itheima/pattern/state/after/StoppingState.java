package com.itheima.pattern.state.after;

/**
 * @version v1.0
 * @ClassName: LiftState
 * @Description: 电梯停止状态
 * @Author: fyp
 * @data: 2021年 09月 16日 21:05
 */
public class StoppingState extends LiftState{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }
}
