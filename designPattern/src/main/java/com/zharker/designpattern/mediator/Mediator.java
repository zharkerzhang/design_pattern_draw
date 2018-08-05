package com.zharker.designpattern.mediator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Mediator {

    private Map<String,Colleague> colleagueMap = new ConcurrentHashMap<>(5);

    public void addColleage(String name, Colleague colleague){
        this.colleagueMap.put(name, colleague);
    }

    public void removeColleage(String name){
        this.colleagueMap.remove(name);
    }

    public abstract Object handle(String colleagueNmae, String method, Object[] args);

    protected Map<String,Colleague> getColleagueMap(){
        return this.colleagueMap;
    }
}
