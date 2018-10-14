package com.zharker.designpattern.state;

/*
stateA => stateB
stateA => stateC
stateB => stateC
stateC => stateA
*/
public class StateB extends State {
    @Override
    public void actionA() {
        System.out.println("under stateB, no do for actionA");
        throw new IllegalStateException();
    }

    @Override
    public void actionB() {
        System.out.println("under stateB, do actionB");
    }

    @Override
    public void actionC() {
        System.out.println("under stateB, turn to stateC");
        context.setState(Context.STATEC);
        context.getState().actionC();
    }
}
