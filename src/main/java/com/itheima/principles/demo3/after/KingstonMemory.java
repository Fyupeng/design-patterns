package com.itheima.principles.demo3.after;

import javax.annotation.Resource;

public class KingstonMemory implements Memory{

    @Override
    public void save(){
        System.out.println("使用金士顿内存条");
    }
}
