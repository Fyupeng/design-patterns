package com.itheima.pattern.state.before;

/**
 * @version v1.0
 * @ClassName: Lift
 * @Description: 电梯类（ILift子实现类）
 * @Author: fyp
 * @data: 2021年 09月 16日 20:31
 */
public class Lift implements ILift {

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state){
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯打开了");
                this.setState(OPENING_STATE);
                break;
            case OPENING_STATE:
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state){
            case OPENING_STATE:
                System.out.println("电梯关闭了");
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state){
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯运行了");
                this.setState(RUNNING_STATE);
                break;
            case OPENING_STATE:
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state){
            case CLOSING_STATE:
            case RUNNING_STATE:
                System.out.println("电梯停止了");
                this.setState(STOPPING_STATE);
                break;
            case OPENING_STATE:
            case STOPPING_STATE:
                break;
        }
    }
}
