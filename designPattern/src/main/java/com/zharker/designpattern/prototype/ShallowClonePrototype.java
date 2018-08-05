package com.zharker.designpattern.prototype;

public class ShallowClonePrototype extends Prototype implements Cloneable {

    private Attribute attribute;

    public ShallowClonePrototype(Attribute attribute) {
        this.attribute = attribute;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    @Override
    public void setAttribute(String attribute) {
    }

    @Override
    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "DeepClonePrototype{" +
                "attribute=" + attribute +
                '}';
    }
}
