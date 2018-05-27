package com.zharker.designpattern.observer.commonImpl;

import com.zharker.designpattern.observer.Observer;

public class ConcreteObserver implements Observer {
    private String name;
    public ConcreteObserver(String name){this.name = name;}
    @Override
    public void update() {
        System.out.println("concreteObserver instance:"+name+" updated");
    }
}
