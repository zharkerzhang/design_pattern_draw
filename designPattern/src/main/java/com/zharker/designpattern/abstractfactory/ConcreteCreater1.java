package com.zharker.designpattern.abstractfactory;

public class ConcreteCreater1 implements AbstractCreater {
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB1();
    }
}
