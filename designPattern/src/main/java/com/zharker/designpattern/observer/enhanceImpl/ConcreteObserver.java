package com.zharker.designpattern.observer.enhanceImpl;

import com.zharker.designpattern.observer.Observer;
import com.zharker.designpattern.observer.Subject;

public class ConcreteObserver implements Observer {

    private ConcreteSubject concreteSubject;
    private String state;

    private String name;

    public ConcreteObserver(ConcreteSubject concreteSubject, String name){
        this.concreteSubject = concreteSubject;
        concreteSubject.registerObserver(this);
        this.name = name;
    }

    @Override
    public void update() {
        this.state = this.concreteSubject.getState();
        System.out.println("this ConcreteObserver: "+name+" get state: "+state+" is updated");
    }
}
