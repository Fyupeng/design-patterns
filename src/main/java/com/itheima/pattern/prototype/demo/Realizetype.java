package com.itheima.pattern.prototype.demo;

/**
 * @version v1.0
 * @ClassName: Realizetype
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 08日 21:01
 */
public class Realizetype implements Cloneable{

    public Realizetype(){
        System.out.println("具体的原型对象创建成功！");
    }

    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
