package com.itheima.pattern.state.before;

/**
 * @version v1.0
 * @ClassName: ILift
 * @Description: 电梯接口类
 * @Author: fyp
 * @data: 2021年 09月 16日 19:59
 */
public interface ILift {

    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    void setState(int state);

    void open();

    void close();

    void run();

    void stop();

}
