package com.zharker.designpattern.memento.origin;

import com.zharker.designpattern.memento.IMemento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IMemento createMemento(){
        return new Memento(this.state);
    }

    public void storeMemento(IMemento iMemento){
        this.setState(iMemento.getState());
    }
}
