package com.itheima.pattern.memento.white_box;

/**
 * @version v1.0
 * @ClassName: GameRole
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 23日 19:35
 */
public class GameRole {
    private int vit;//生命力
    private int atk;//攻击力
    private int def;//防御力

    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoverState(RoleStateMemento roleStateMemento){
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    public void stateDisplay(){
        System.out.println("角色生命力：" + vit);
        System.out.println("角色攻击力：" + atk);
        System.out.println("角色防御力：" + def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
