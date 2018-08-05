package com.zharker.designpattern.adapter;

public class Adaptee1 {

    public void doSomething(){
        System.out.println(this.getClass().getSimpleName()+" instance doSomething");
    }

}
