package com.itheima.pattern.combination;

/**
 * @version v1.0
 * @ClassName: MenuComponent
 * @Description: 菜单组件：属于抽象根节点
 * @Author: fyp
 * @data: 2021年 09月 14日 20:53
 */
public abstract class MenuComponent {
    protected String name;
    protected int level;

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        return name;
    }

    public abstract void print();
}
