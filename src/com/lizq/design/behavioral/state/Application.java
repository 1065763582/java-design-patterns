package com.lizq.design.behavioral.state;

/**
 * @author lizq
 * @date 2019/01/23 22:26
 */
public class Application {
    public static void main(String[] args) {
        Context context = new Context();
        // 初始化状态
        State state = new ConcreteStateA();
        context.setCurrentState(state);
        context.stepOne();
        context.stepTwo();
        context.stepThree();
    }
}
