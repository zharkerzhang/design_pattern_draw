package com.zharker.designpattern.adapter;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println(this.getClass().getSimpleName()+" instance request");
    }
}
