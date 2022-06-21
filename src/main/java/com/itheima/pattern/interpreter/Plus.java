package com.itheima.pattern.interpreter;

/**
 * @version v1.0
 * @ClassName: Plus
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 23日 20:53
 */
public class Plus extends AbstractExpression{

    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "+" + right.toString() + ")";
    }
}
