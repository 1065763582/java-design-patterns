package com.lizq.design.behavioral.mediator;

/**
 * @author lizq
 * @date 2019/02/08 12:47
 */
public class ConcreteColleagueA extends Colleague{
    //通过构造函数传递中介者
    public ConcreteColleagueA(Mediator mediator){
        super(mediator);
    }
    //自有方法 self-method
    public void selfMethod(){
        System.out.println("AAA is working");
    }
    //依赖方法 dep-method
    public void depMethod(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething();
    }
}
