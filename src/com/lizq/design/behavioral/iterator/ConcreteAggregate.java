package com.lizq.design.behavioral.iterator;

/**
 * @author lizq
 * @date 2019/01/25 23:19
 */
public class ConcreteAggregate implements Aggregate {

    private int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator {
        private int cursor = 0;
        private int size = ConcreteAggregate.this.ints.length;

        @Override
        public Object next() {
            return ConcreteAggregate.this.ints[cursor++];
        }

        @Override
        public boolean hasNext() {
            return this.size > this.cursor;
        }
    }
}
