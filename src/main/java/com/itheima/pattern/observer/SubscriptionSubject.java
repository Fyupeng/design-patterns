package com.itheima.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ClassName: SubscriptionSubjet
 * @Description: 具体主题角色类
 * @Author: fyp
 * @data: 2021年 09月 20日 22:52
 */
public class SubscriptionSubject implements Subject{

    private List<Observer> weiXinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer : weiXinUserList){
            observer.update(message);
        }
    }
}
