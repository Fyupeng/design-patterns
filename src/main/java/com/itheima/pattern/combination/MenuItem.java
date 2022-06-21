package com.itheima.pattern.combination;

/**
 * @version v1.0
 * @ClassName: MenuItem
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 14日 21:07
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for(int i = 0; i < level; i++){
            System.out.printf("  ");
        }
        System.out.println("--" + name);
    }
}
