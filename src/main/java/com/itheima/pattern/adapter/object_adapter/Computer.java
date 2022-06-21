package com.itheima.pattern.adapter.object_adapter;

/**
 * @version v1.0
 * @ClassName: Computer
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 10日 15:50
 */
public class Computer {

    public String readSD(SDCard sdCard) {
        if(sdCard == null){
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
