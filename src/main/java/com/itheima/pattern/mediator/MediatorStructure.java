package com.itheima.pattern.mediator;

/**
 * @version v1.0
 * @ClassName: MediatorStructure
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 21日 14:51
 */
public class MediatorStructure extends Mediator{

    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if(person == houseOwner){
            tenant.getMessage(message);
        }else{
            houseOwner.getMessage(message);
        }
    }
}
