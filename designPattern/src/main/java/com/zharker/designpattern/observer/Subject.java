package com.zharker.designpattern.observer;

import com.zharker.designpattern.observer.Observer;

public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
