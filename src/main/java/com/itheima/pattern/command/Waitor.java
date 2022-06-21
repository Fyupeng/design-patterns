package com.itheima.pattern.command;

import javax.crypto.Cipher;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * @version v1.0
 * @ClassName: Waitor
 * @Description: 请求者角色
 * @Author: fyp
 * @data: 2021年 09月 16日 16:37
 */
public class Waitor {
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd){
        commands.add(cmd);
    }

    public void orderUp(){
        System.out.println("美女服务员：大厨，新订单来了....");

        for(Command command : commands){
            if(command != null){
                command.execute();
            }
        }

    }

}
