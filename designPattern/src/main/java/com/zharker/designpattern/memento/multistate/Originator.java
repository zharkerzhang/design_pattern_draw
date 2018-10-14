package com.zharker.designpattern.memento.multistate;

import com.zharker.designpattern.memento.IMemento;

import java.util.HashMap;

public class Originator {
    private String state1;
    private String state2;
    private String state3;



    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    public IMemento createMemento(){
        Memento memento = new Memento();
        memento.setStateMap(new HashMap<String,Object>(){{this.put("state1",state1);this.put("state2",state2);this.put("state3",state3);}});
        return memento;
    }

    public void storeMemento(IMemento iMemento){
        if(!(iMemento instanceof Memento)){
            return ;
        }
        Memento memento = (Memento)iMemento;
        this.setState1((String)memento.getStateMap().get("state1"));
        this.setState2((String)memento.getStateMap().get("state2"));
        this.setState3((String)memento.getStateMap().get("state3"));
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state1='" + state1 + '\'' +
                ", state2='" + state2 + '\'' +
                ", state3='" + state3 + '\'' +
                '}';
    }
}
