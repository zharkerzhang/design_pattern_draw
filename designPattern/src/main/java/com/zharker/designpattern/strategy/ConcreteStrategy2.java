package com.zharker.designpattern.strategy;

public class ConcreteStrategy2 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName()+ "instance doSomething");
    }
}
