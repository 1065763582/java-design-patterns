package com.lizq.design.behavioral.mediator;

/**
 * @author lizq
 * @date 2019/02/08 12:47
 */
public class ConcreteColleagueB extends Colleague{
    //通过构造函数传递中介者
    public ConcreteColleagueB(Mediator mediator){
        super(mediator);
    }
    //自有方法 self-method
    public void selfMethodA(){
        System.out.println("BBB is working");
    }
    //依赖方法 dep-method
    public void depMethodB(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething();
    }
}
