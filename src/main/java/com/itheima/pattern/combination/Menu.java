package com.itheima.pattern.combination;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ClassName: Menu
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 14日 20:58
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }


    @Override
    public void print() {
        for(int i = 0; i < level; i++){
            System.out.printf("  ");
        }
        System.out.println("--" + name);
        //遍历子节点
        for(MenuComponent component : menuComponents){
            component.print();
        }
    }
}
