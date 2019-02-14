package com.lizq.design.behavioral.interpreter;

/**
 * @author lizq
 * @date 2019/02/14 21:30
 */
public class SubtractExpression extends OperatorExpression {
    public SubtractExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret() {
        return expression1.interpret() - expression2.interpret();
    }
}
