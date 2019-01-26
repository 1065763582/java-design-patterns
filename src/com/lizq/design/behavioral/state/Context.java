package com.lizq.design.behavioral.state;

/**
 * @author lizq
 * @date 2019/01/26 19:22
 */
public class Context implements StateOperation {
    //定义状态
    public final static State STATEA = new ConcreteStateA();
    public final static State STATEB = new ConcreteStateB();
    public final static State STATEC = new ConcreteStateC();
    //当前状态
    private State currentState;

    //获得当前状态
    public State getCurrentState() {
        return currentState;
    }

    //设置当前状态
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        //切换状态
        this.currentState.setContext(this);
    }

    //行为委托

    @Override
    public void stepOne() {
        this.currentState.stepOne();
    }

    @Override
    public void stepTwo() {
        this.currentState.stepTwo();
    }

    @Override
    public void stepThree() {
        this.currentState.stepThree();
    }
}
