package com.lizq.design.behavioral.visitor;

/**
 * @author lizq
 * @date 2019/02/08 17:52
 */
public class BusinessB implements Element {
    private String properties;

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "BusinessB{" +
                "properties='" + properties + '\'' +
                '}';
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visitor(this);
    }
}
