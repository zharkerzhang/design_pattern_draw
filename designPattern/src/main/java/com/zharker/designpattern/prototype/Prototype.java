package com.zharker.designpattern.prototype;

public abstract class Prototype {

    public abstract void setAttribute(String attribute);

    public abstract void setAttribute(Attribute attribute);

    public Prototype clone(){
        Prototype result = null;
        try {
            result = (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }
}
