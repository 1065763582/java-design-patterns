package com.lizq.design.behavioral.visitor;

/**
 * @author lizq
 * @date 2019/02/08 17:52
 */
public class BusinessA implements Element{
    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "BusinessA{" +
                "attr='" + attr + '\'' +
                '}';
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visitor(this);
    }
}
