package com.itheima.pattern.state.before;

import java.util.List;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 20:50
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();

        lift.setState(ILift.RUNNING_STATE);

        lift.open();
        lift.close();
        lift.run();
        lift.stop();


    }
}
