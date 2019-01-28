package com.lizq.design.behavioral.responsebility;

/**
 * @author lizq
 * @date 2019/01/28 21:36
 */
public abstract class Handler {
    private Handler successor;

    public final String handleMessage(Request request) {
        String response = null;
        if (this.getHandlerLevel().equals(request.getLevel())) {
            response = this.echo(request);
        } else {
            if (this.successor != null) {
                response = this.successor.handleMessage(request);
            } else {
                System.out.println("没有处理该业务的对象");
            }
        }
        return response;
    }

    public void setNext(Handler handler) {
        this.successor = handler;
    }

    //每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();

    //每个处理者都必须实现处理任务
    protected abstract String echo(Request request);
}
