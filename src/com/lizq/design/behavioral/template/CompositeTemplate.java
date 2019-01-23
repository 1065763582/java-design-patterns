package com.lizq.design.behavioral.template;

/**
 * @author lizq
 * @date 2019/01/23 22:02
 */
public class CompositeTemplate {

    private Process process;

    public CompositeTemplate(Process process) {
        this.process = process;
    }

    // 声明为final 是不希望子类重写这个算法的结构
    // 采用组合的方式
    public final void doIt() {
        process.stepOne();
        if (process.hook()) {
            process.stepTwo();
        }
        process.stepThree();
    }
}
