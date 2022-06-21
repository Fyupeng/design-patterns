package com.itheima.pattern.state.after;

/**
 * @version v1.0
 * @ClassName: LiftState
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 21:05
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void stop();

    public abstract void run();

}
