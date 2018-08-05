package com.zharker.designpattern;

import com.zharker.designpattern.mediator.*;
import org.junit.Test;

public class MediatorTest {

    @Test
    public void mediatorTest1(){

        Mediator m = new ConcreteMediator();
        Colleague c1 = new ConcreteColleague1(m);
        Colleague c2 = new ConcreteColleague2(m);

        m.handle("ConcreteColleague1","doSelf", new Object[]{});

        m.handle("ConcreteColleague2","doOther", new Object[]{});

        m.handle("ConcreteColleague2", "doOtherCall", new Object[]{c1});

    }
}
