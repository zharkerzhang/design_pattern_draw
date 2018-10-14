package com.zharker.designpattern.memento.multistate;

import com.zharker.designpattern.memento.IMemento;

import java.util.HashMap;

public class Memento implements IMemento{
    private HashMap<String,Object> stateMap = new HashMap<>(10);

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
