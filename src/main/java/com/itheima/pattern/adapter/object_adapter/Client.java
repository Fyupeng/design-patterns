package com.itheima.pattern.adapter.object_adapter;

import com.itheima.pattern.adapter.class_adapter.TFCard;

import java.io.*;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 客户端
 * @Author: fyp
 * @data: 2021年 09月 10日 15:51
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("====================");

        //读取tdCard中的数据
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);

        Reader reader = new InputStreamReader(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        });



    }

}
