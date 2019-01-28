package com.lizq.design.behavioral.responsebility;

/**
 * @author lizq
 * @date 2019/01/23 21:30
 */
public class Application {
    public static void main(String[] args) {
        Context context = new Context();
        Request request = new Request();
        request.setLevel(Level.B);
        System.out.println(context.doABC(request));
        request.setLevel(Level.A);
        System.out.println(context.doCBA(request));
    }
}
