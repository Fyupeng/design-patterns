package com.itheima.pattern.memento.white_box;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 23日 19:48
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("====================大战boss前====================");

        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("====================大战boss后====================");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("====================恢复之前的状态====================");

        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();


    }
}
