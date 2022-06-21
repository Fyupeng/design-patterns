package com.itheima.pattern.memento.white_box;

/**
 * @version v1.0
 * @ClassName: RoleStateCaretaker
 * @Description: 备忘录对象管理对象
 * @Author: fyp
 * @data: 2021年 09月 23日 19:46
 */
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
