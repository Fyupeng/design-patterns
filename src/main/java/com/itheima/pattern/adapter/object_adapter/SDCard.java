package com.itheima.pattern.adapter.object_adapter;

/**
 * @version v1.0
 * @ClassName: SDCard
 * @Description: 目标接口
 * @Author: fyp
 * @data: 2021年 09月 10日 15:47
 */
public interface SDCard {

    String readSD();

    void writeSD(String msg);
}
