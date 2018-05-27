package com.zharker.designpattern.observer.enhanceImpl;

import com.zharker.designpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject implements com.zharker.designpattern.observer.Subject{
    private List<Observer> observers = new ArrayList<>(20);


    public void registerObserver(Observer o){
        if(o==null){
            return;
        }
        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        observers.forEach(Observer::update);
    }
}
