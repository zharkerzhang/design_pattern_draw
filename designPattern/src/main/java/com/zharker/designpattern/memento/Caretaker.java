package com.zharker.designpattern.memento;

public class Caretaker {
    private IMemento iMemento;

    public IMemento getIMemento() {
        return iMemento;
    }

    public void setIMemento(IMemento iMemento) {
        this.iMemento = iMemento;
    }
}
