package com.zharker.designpattern.memento;

import java.util.HashMap;

public class CheckPointCaretaker extends Caretaker {
    private HashMap<String,IMemento> mementoHashMap = new HashMap<>(10);

    public IMemento getIMemento(String checkPoint) {
        return this.mementoHashMap.get(checkPoint);
    }

    public void setIMemento(String checkPoint, IMemento iMemento) {
        this.mementoHashMap.put(checkPoint,iMemento);
    }
}
