package com.zharker.designpattern;

import com.zharker.designpattern.builder.ConcreteBuilderA;
import com.zharker.designpattern.builder.ConcreteBuilderB;
import com.zharker.designpattern.builder.ConcreteBuilderC;
import com.zharker.designpattern.builder.Director;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void builderTest(){
        Director d = new Director(new ConcreteBuilderB());
        System.out.println(d.getProduct());
        d.setBuilder(new ConcreteBuilderA());
        System.out.println(d.getProduct());
        d.setBuilder(new ConcreteBuilderC());
        System.out.println(d.getProduct());

    }
}
