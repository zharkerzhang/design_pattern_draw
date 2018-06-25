package com.zharker.designpattern.factorymethod;

import com.zharker.designpattern.observer.enhanceImpl.ConcreteSubject;

public class ConcreteProduct implements Product {

    public ConcreteProduct(){
        System.out.println("ConcreteProduct instance created");
    }
}
