package com.lizq.design.behavioral.iterator;

/**
 * @author lizq
 * @date 2019/01/23 22:26
 */
public class Application {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.getIterator();
        while(iterator.hasNext()){
            int i = (int) iterator.next();
            System.out.println(i);
        }
    }
}
