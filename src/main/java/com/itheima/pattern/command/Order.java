package com.itheima.pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @version v1.0
 * @ClassName: Order
 * @Description: 订单类
 * @Author: fyp
 * @data: 2021年 09月 16日 16:16
 */
public class Order {
    private int diningTable;
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        this.foodDir.put(name, num);
    }
}
