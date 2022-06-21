package com.itheima.pattern.adapter.object_adapter;

/**
 * @version v1.0
 * @ClassName: SDCardImpl
 * @Description: 目标类
 * @Author: fyp
 * @data: 2021年 09月 10日 15:48
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg: hello world SDCard";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg: " + msg);
    }
}
