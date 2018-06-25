package com.zharker.designpattern;

import com.zharker.designpattern.abstractfactory.AbstractCreater;
import com.zharker.designpattern.abstractfactory.AbstractProduct;
import com.zharker.designpattern.abstractfactory.ConcreteCreater1;
import com.zharker.designpattern.abstractfactory.ConcreteCreater2;
import com.zharker.designpattern.factorymethod.*;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void factoryTest1(){

        Creater c = new ConcreteCreater();
        Product p = c.createProduct();

        Product p2 = SimpleFactoryCreater.createProduct(ConcreteProduct.class);

    }

    @Test
    public void factoryTest2(){

        AbstractCreater c1 = new ConcreteCreater1();
        AbstractCreater c2 = new ConcreteCreater2();

        AbstractProduct a1 = c1.createAbstractProductA();
        AbstractProduct b1 = c1.createAbstractProductB();
        AbstractProduct a2 = c2.createAbstractProductA();
        AbstractProduct b2 = c2.createAbstractProductB();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println(b2);


    }
}
