package com.itheima.pattern.adapter.object_adapter;

/**
 * @version v1.0
 * @ClassName: TFCardImpl
 * @Description: 适配者类
 * @Author: fyp
 * @data: 2021年 09月 10日 15:45
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg: hello world TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg: " + msg);
    }
}
