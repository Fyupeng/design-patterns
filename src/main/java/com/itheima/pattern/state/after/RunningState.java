package com.itheima.pattern.state.after;

/**
 * @version v1.0
 * @ClassName: LiftState
 * @Description: 电梯运行状态
 * @Author: fyp
 * @data: 2021年 09月 16日 21:05
 */
public class RunningState extends LiftState{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }

    @Override
    public void run() {
        System.out.println("电梯正在运行");
    }
}
