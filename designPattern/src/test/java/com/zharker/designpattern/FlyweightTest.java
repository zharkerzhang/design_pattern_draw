package com.zharker.designpattern;

import com.zharker.designpattern.flyweight.Flyweight;
import com.zharker.designpattern.flyweight.FlyweightFactory;
import org.junit.Test;

public class FlyweightTest {

    @Test
    public void flyweightTest(){
        Flyweight flyweight = FlyweightFactory.getFlyweight("extinsic1");
        flyweight.setIntrinsic("23333");
        flyweight.operate();
        flyweight.setIntrinsic("3333");
        flyweight.operate();
    }
}
