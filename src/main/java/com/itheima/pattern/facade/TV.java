package com.itheima.pattern.facade;

import java.net.SocketTimeoutException;

/**
 * @version v1.0
 * @ClassName: TV
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 14日 11:17
 */
public class TV {
    public void on(){
        System.out.println("打开电视");
    }

    public void off(){
        System.out.println("关闭电视");
    }
}
