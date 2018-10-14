package com.zharker.designpattern.state;

public class Context {

    public final static State STATEA = new StateA();
    public final static State STATEB = new StateB();
    public final static State STATEC = new StateC();

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void actionA(){
        state.actionA();
    }

    public void actionB(){
        state.actionB();
    }
    public void actionC(){
        state.actionC();
    }
}
