package com.zharker.designpattern.memento.origin;

import com.zharker.designpattern.memento.IMemento;

public class Memento implements IMemento{
    public Memento(String state) {
        this.state = state;
    }

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
