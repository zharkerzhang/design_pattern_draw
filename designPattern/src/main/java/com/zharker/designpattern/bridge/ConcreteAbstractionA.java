package com.zharker.designpattern.bridge;

public class ConcreteAbstractionA extends Abstraction {
    public ConcreteAbstractionA(Implemetor implemetor) {
        super(implemetor);
    }

    @Override
    protected void dohandle1() {
        System.out.println("calling "+this.getClass().getSimpleName()+" method: dohandle1");
        getImplemetor().handleAImpl();
    }

    @Override
    protected void dohandle2() {
        System.out.println("calling "+this.getClass().getSimpleName()+" method: dohandle2");
        getImplemetor().handleAImpl();
    }
}
