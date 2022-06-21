package com.itheima.pattern.interpreter;

/**
 * @version v1.0
 * @ClassName: AbstractExpression
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 23日 20:50
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
