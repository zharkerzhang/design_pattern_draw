package com.zharker.designpattern;

import com.zharker.designpattern.bridge.*;
import org.junit.Test;

public class BridgeTest {
    @Test
    public void bridgeTest(){
        Implemetor implemetor1 = new ConcreteImplemetor1();
        Abstraction abstraction = new ConcreteAbstractionA(implemetor1);
        abstraction.handle();
        System.out.println("=========================================");
        abstraction = new ConcreteAbstractionB(new ConcreteImplemetor2());
        abstraction.handle();
    }
}
