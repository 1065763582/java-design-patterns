package com.lizq.design.behavioral.interpreter;

/**
 * 终结表达式 对应数字
 *
 * @author lizq
 * @date 2019/02/14 21:23
 */
public class NumExpression implements Expression {
    private String num;

    public NumExpression(String num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return Integer.parseInt(this.num);
    }
}
