package com.itheima.pattern.adapter.class_adapter;

/**
 * @version v1.0
 * @ClassName: TFCard
 * @Description: 适配者类的接口
 * @Author: fyp
 * @data: 2021年 09月 10日 15:44
 */
public interface TFCard {
    String readTF();

    void writeTF(String msg);
}
