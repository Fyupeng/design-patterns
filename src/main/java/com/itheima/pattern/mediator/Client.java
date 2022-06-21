package com.itheima.pattern.mediator;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 21日 14:53
 */
public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();

        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("我要租三室的房子！！！");
        houseOwner.contact("我这里有三室的房子，要租吗？");




    }
}
