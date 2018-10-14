package com.zharker.designpattern;

import com.zharker.designpattern.state.Context;
import org.junit.Test;

/*
stateA => stateB
stateA => stateC
stateB => stateC
stateC => stateA
*/

public class StateTest {
    @Test
    public void stateTest(){
        Context context = new Context();
        context.setState(Context.STATEA);

        context.actionC();
        context.actionA();
        context.actionB();
    }
}
