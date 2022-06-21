package com.itheima.pattern.memento.black_box;

import com.itheima.pattern.mediator.Mediator;
import com.itheima.pattern.memento.white_box.RoleStateMemento;

/**
 * @version v1.0
 * @ClassName: RoleStateCaretaker
 * @Description: 备忘录对象管理对象
 * @Author: fyp
 * @data: 2021年 09月 23日 19:46
 */
public class RoleStateCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
