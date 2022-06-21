package com.itheima.pattern.state.after;

import sun.swing.StringUIClientPropertyKey;

/**
 * @version v1.0
 * @ClassName: LiftState
 * @Description: 电梯打开状态
 * @Author: fyp
 * @data: 2021年 09月 16日 21:05
 */
public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

    }
}
