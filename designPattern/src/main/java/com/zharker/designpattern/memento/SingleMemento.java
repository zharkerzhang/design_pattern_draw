package com.zharker.designpattern.memento;

public class SingleMemento implements Cloneable {
    private SingleMemento backup;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento(){
        this.backup = this.clone();
    }

    public void storeMemento(){
        this.setState(this.backup.getState());
    }

    @Override
    protected SingleMemento clone(){
        try {
            return (SingleMemento)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
