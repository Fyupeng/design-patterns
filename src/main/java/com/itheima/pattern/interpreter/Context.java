package com.itheima.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @version v1.0
 * @ClassName: Context
 * @Description: 环境角色类
 * @Author: fyp
 * @data: 2021年 09月 23日 20:50
 */
public class Context {
    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable var, Integer value){
        map.put(var, value);
    }

    public int getValue(Variable var){
        return map.get(var);
    }
}
