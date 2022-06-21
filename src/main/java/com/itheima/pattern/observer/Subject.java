package com.itheima.pattern.observer;

/**
 * @version v1.0
 * @ClassName: Subject
 * @Description: 主题对象
 * @Author: fyp
 * @data: 2021年 09月 20日 22:49
 */
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notify(String message);
}
