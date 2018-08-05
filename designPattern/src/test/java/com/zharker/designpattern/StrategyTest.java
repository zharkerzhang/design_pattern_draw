package com.zharker.designpattern;

import com.zharker.designpattern.strategy.*;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void strategyTest1(){
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
        strategy = new ConcreteStrategy2();
        context.setStrategy(strategy);
        context.doAnything();
    }

    @Test
    public void strategyTest2(){
        StrategyEnum.STRATEGY_1.doSomething();

        StrategyEnum.STRATEGY_2.doSomething();
    }
}
