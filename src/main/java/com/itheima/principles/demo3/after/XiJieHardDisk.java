package com.itheima.principles.demo3.after;

public class XiJieHardDisk implements HardDisk{

    @Override
    public void save(String data){
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    @Override
    public String get(){
        System.out.println("使用希捷硬盘接收数据");
        return "数据";
    }
}
