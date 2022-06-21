package com.itheima.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassName: MobileBuilder
 * @Description: 具体构建者
 * @Author: fyp
 * @data: 2021年 09月 09日 16:14
 */
public class MobileBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车架");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
