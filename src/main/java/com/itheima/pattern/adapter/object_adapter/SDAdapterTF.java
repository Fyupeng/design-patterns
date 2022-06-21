package com.itheima.pattern.adapter.object_adapter;

/**
 * @version v1.0
 * @ClassName: SDAdapterTF
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 10日 15:55
 */
public class SDAdapterTF implements SDCard{

    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adpapter write tf card");
        tfCard.writeTF(msg);
    }
}
