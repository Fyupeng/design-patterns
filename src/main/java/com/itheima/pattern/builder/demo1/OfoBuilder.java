package com.itheima.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassName: OfoBuilder
 * @Description: Ofo单车构建者:用来构建ofo单车
 * @Author: fyp
 * @data: 2021年 09月 09日 16:16
 */
public class OfoBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
