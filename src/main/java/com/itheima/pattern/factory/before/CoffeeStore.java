package com.itheima.pattern.factory.before;

import sun.font.GlyphLayout;

/**
 * @version v1.0
 * @ClassName: CoffeeStore
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 05日 20:56
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        //加配料
        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }
}
