package com.itheima.pattern.state.after;

/**
 * @version v1.0
 * @ClassName: Context
 * @Description: 环境状态类
 * @Author: fyp
 * @data: 2021年 09月 16日 21:05
 */
public class Context {

    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StoppingState STOPPING_STATE = new StoppingState();

    private LiftState liftState;


    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }

}
