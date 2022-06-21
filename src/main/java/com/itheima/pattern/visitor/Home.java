package com.itheima.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ClassName: Home
 * @Description: 对象结构类
 * @Author: fyp
 * @data: 2021年 09月 23日 17:24
 */
public class Home {

    private List<Animal> nodeList = new ArrayList<>();

    public void add(Animal animal){
        nodeList.add(animal);
    }

    public void action(Person person){
        for(Animal animal : nodeList){
            animal.accept(person);
        }
    }
}
