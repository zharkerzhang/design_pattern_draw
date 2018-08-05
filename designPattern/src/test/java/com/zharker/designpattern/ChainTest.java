package com.zharker.designpattern;

import com.zharker.designpattern.chainofresposibility.*;
import org.junit.Test;

public class ChainTest {

    @Test
    public void chainTest(){
        Handler h1 = new ConcreteHandler1(new Level(1));
        Handler h2 = new ConcreteHandler2(new Level(2));
        Handler h3 = new ConcreteHandler3(new Level(3));

        h3.setNextHandler(h1);
        h1.setNextHandler(h2);

        Response response = h3.handleMessage(new Request(new Level(2)));

        System.out.println(response);

    }
}
