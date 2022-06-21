package com.itheima.pattern.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

/**
 * @version v1.0
 * @ClassName: RuntimeDemo
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 05日 20:45
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        Process process = runtime.exec("ipconfig");
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        int len = is.read(arr);
        System.out.println(new String(arr, 0, len, "GBK"));
    }
}
