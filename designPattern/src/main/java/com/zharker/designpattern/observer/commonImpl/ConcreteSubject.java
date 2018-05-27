package com.zharker.designpattern.observer.commonImpl;

import com.zharker.designpattern.observer.Observer;
import com.zharker.designpattern.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>(20);

    @Override
    public void registerObserver(Observer o) {
        if(o==null){
            return;
        }
        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
