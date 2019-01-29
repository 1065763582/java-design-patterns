package com.lizq.design.behavioral.responsebility;

/**
 * @author lizq
 * @date 2019/01/28 21:42
 */
public class Context {
    private Handler a = new ConcreteHandlerA();
    private Handler b = new ConcreteHandlerB();
    private Handler c = new ConcreteHandlerC();

    public String doABC(Request request) {
        this.clear();
        a.setNext(b);
        b.setNext(c);
        return a.handleMessage(request);
    }


    public String doCBA(Request request) {
        this.clear();
        c.setNext(b);
        b.setNext(a);
        return c.handleMessage(request);
    }

    private void clear() {
        a.setNext(null);
        b.setNext(null);
        c.setNext(null);
    }
}
