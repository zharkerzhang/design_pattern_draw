package com.zharker.designpattern.state;

/*
stateA => stateB
stateA => stateC
stateB => stateC
stateC => stateA
*/
public class StateC extends State {
    @Override
    public void actionA() {
        System.out.println("under stateC, turn to stateA");
        context.setState(Context.STATEA);
        context.getState().actionA();
    }

    @Override
    public void actionB() {
        System.out.println("under stateC, no do for actionB");
        throw new IllegalStateException();
    }

    @Override
    public void actionC() {
        System.out.println("under stateC, do actionC");

    }
}
