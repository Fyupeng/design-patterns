package com.itheima.pattern.interpreter;

import com.sun.org.apache.xml.internal.serializer.ToStream;

/**
 * @version v1.0
 * @ClassName: Variable
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 23日 20:50
 */
public class Variable extends AbstractExpression {
    private String name;

    public Variable(String name){
        this.name = name;
    }

    @Override
    public int interpret(Context context){
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
