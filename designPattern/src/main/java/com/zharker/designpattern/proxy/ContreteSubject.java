package com.zharker.designpattern.proxy;

public class ContreteSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("ContreteSubject instance do something");
    }
}
