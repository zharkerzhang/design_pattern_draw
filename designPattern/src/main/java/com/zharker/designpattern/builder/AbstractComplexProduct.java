package com.zharker.designpattern.builder;

public abstract class AbstractComplexProduct {

    public String toString(){
        return this.getClass().getSimpleName()+" instance";
    }
}
