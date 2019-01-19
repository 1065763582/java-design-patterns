package com.lizq.design.structural.adapter.obj;

import com.lizq.design.structural.adapter.ConcreteTarget;
import com.lizq.design.structural.adapter.Target;

/**
 * 应用层都使用新的接口，但是新的客户使用ConcreteTarget实例，老客户使用Adapter实例。
 * 注意：为了减少风险，因此必须少改代码，target.request();只会出现一行，这里有两行是为了展示效果。
 * 具体用哪个实例，可根据当前业务上下文使用IOC去注入。若后面还有新的业务，就要接口不变，直接实现Target即可，符合开闭原则。
 * 当然，第一次适配不可避免都会修改应用层，使用适配器的难点在于全面的考虑接口通用性，否则下次接口更新又需要套一层适配器，增加了代码阅读和理解难度
 * @author lizq
 * @date 2019/01/19 22:52
 */
public class Application {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
