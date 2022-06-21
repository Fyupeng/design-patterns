package com.itheima.pattern.adapter.class_adapter;

/**
 * @version v1.0
 * @ClassName: SDAdapterTF
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 10日 15:55
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adpapter write tf card");
        writeTF(msg);
    }
}
