package com.zharker.designpattern.prototype;

public class ContretePrototype extends Prototype implements Cloneable {

    private String attribute;

    public ContretePrototype(String attribute) {
        this.attribute = attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void setAttribute(Attribute attribute) {
    }

    public String toString() {
        return "ContretePrototype{" +
                "attribute='" + attribute + '\'' +
                '}';
    }
}
