package com.itheima.principles.demo3.before;

public class XiJieHardDisk {

    public void save(String data){
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    public String get(){
        System.out.println("使用希捷硬盘接收数据");
        return "数据";
    }
}
