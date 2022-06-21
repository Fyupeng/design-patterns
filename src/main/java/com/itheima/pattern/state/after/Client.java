package com.itheima.pattern.state.after;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 21:34
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setLiftState(new StoppingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
