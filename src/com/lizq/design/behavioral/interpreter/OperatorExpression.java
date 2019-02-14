package com.lizq.design.behavioral.interpreter;

/**
 *
 * 非终结符， 运算符表达式的公共父类
 * @author lizq
 * @date 2019/02/14 21:26
 */
public abstract class OperatorExpression implements Expression{
    protected Expression expression1;

    protected Expression expression2;

    public OperatorExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
