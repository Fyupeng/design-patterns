package com.itheima.pattern.facade;

/**
 * @version v1.0
 * @ClassName: SmartAppliancesFacade
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 14日 11:20
 */
public class SmartAppliancesFacade {

    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void say(String message){
        if(message.contains("打开")){
            on();
        }else if(message.contains("关闭")){
            off();
        }else{
            System.out.println("我听不懂你说的话！！！");
        }
    }

    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off(){
        light.off();
        tv.off();
        airCondition.off();
    }

}
