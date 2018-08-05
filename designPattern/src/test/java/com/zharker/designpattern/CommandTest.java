package com.zharker.designpattern;

import com.zharker.designpattern.command.*;
import org.junit.Test;

public class CommandTest {

    @Test
    public void commandTest(){

        Receiver r1 = new ConcreteReceiver1();
        Receiver r2 = new ConcreteReceiver2();

        Command c1 = new ConcreteCommand1(r1);
        Command c2 = new ConcreteCompositeCommand2(r2, c1, new Command() {{
            this.setReceiver(r2);
        }});
        ConcreteInvoker invoker = new ConcreteInvoker();
        invoker.addCommand(c1);
        invoker.addCommand(c2);

        System.out.println("c1: "+invoker.execute(c1, "23333 ","333 ","555\r\n"));
        System.out.println("c2: "+invoker.execute(c2,"555 ","444 "));

    }
}
