package com.zharker.designpattern;

import com.zharker.designpattern.decorator.Component;
import com.zharker.designpattern.decorator.ConcreteComponent;
import com.zharker.designpattern.decorator.ConcreteDecorator1;
import com.zharker.designpattern.decorator.ConcreteDecorator2;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void decoratorTest(){

        Component component = new ConcreteComponent();

        component = new ConcreteDecorator1(component);

        component = new ConcreteDecorator2(component);

        component.operate();


    }
}
