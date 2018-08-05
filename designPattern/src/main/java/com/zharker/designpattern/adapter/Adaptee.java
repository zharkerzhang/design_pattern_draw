package com.zharker.designpattern.adapter;

public class Adaptee {

    public void doSomething(){
        System.out.println(this.getClass().getSimpleName()+" instance doSomething");
    }
}
