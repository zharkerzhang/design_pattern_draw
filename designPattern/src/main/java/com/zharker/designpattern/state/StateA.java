package com.zharker.designpattern.state;

/*
stateA => stateB
stateA => stateC
stateB => stateC
stateC => stateA
*/
public class StateA extends State {
    @Override
    public void actionA() {
        System.out.println("under stateA, do actionA");
    }

    @Override
    public void actionB() {
        System.out.println("under stateA, turn to stateB");
        context.setState(Context.STATEB);
        context.getState().actionB();
    }

    @Override
    public void actionC() {
        System.out.println("under stateA, turn to stateC");
        context.setState(Context.STATEC);
        context.getState().actionC();
    }
}
