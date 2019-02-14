package com.lizq.design.behavioral.interpreter;

/**
 * @author lizq
 * @date 2019/01/23 22:26
 */
public class Application {
    public static void main(String[] args) {
        Context context1 = new Context("2+3");
        System.out.println(context1.interpret());
        Context context2 = new Context("2-3");
        System.out.println(context2.interpret());
    }
}
