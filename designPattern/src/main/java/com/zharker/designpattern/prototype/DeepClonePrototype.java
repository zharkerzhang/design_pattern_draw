package com.zharker.designpattern.prototype;

public class DeepClonePrototype extends ShallowClonePrototype {
    public DeepClonePrototype(Attribute attribute) {
        super(attribute);
    }

    @Override
    public Prototype clone() {
        ShallowClonePrototype clonePrototype = (ShallowClonePrototype)super.clone();
        try {
            clonePrototype.setAttribute((Attribute) super.getAttribute().clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonePrototype;

    }
}
