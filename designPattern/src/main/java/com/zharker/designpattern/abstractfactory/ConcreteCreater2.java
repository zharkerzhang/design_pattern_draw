package com.zharker.designpattern.abstractfactory;

public class ConcreteCreater2 implements AbstractCreater {
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB2();
    }
}
