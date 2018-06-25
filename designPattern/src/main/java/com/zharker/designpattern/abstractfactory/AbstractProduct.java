package com.zharker.designpattern.abstractfactory;

public abstract class AbstractProduct {

    public String toString(){
        return "this is "+this.getClass().getSimpleName()+" instance";
    }
}
