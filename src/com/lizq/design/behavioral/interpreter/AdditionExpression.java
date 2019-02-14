package com.lizq.design.behavioral.interpreter;

/**
 * + 运算符
 * @author lizq
 * @date 2019/02/14 21:27
 */
public class AdditionExpression extends OperatorExpression {
    public AdditionExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret() {
        return expression1.interpret() + expression2.interpret();
    }
}
