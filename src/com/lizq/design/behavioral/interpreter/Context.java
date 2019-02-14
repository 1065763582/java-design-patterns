package com.lizq.design.behavioral.interpreter;

import java.util.Stack;

/**
 * @author lizq
 * @date 2019/02/14 21:31
 */
public class Context {
    private Stack<Expression> expressions = new Stack<>();

    public Context(String operation) {
        String[] expresses = operation.split("");
        Expression epr1;
        Expression epr2;
        for (int i = 0; i < expresses.length; i++) {
            switch (expresses[i]) {
                case "+":
                    epr1 = this.expressions.pop();
                    epr2 = new NumExpression(expresses[++i]);
                    Expression add = new AdditionExpression(epr1, epr2);
                    this.expressions.push(add);
                    break;
                case "-":
                    epr1 = this.expressions.pop();
                    epr2 = new NumExpression(expresses[++i]);
                    Expression subtract = new SubtractExpression(epr1, epr2);
                    this.expressions.push(subtract);
                    break;
                default:
                    this.expressions.push(new NumExpression(expresses[i]));
                    break;
            }
        }
    }

    public int interpret() {
        int reslut = expressions.pop().interpret();
        expressions.clear();
        return reslut;
    }
}
