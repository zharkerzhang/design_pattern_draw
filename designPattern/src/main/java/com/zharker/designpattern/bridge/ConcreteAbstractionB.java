package com.zharker.designpattern.bridge;

public class ConcreteAbstractionB extends Abstraction {
    public ConcreteAbstractionB(Implemetor implemetor) {
        super(implemetor);
    }

    @Override
    protected void dohandle1() {
        System.out.println("calling "+this.getClass().getSimpleName()+" method: dohandle1");
        getImplemetor().handleBImpl();
    }

    @Override
    protected void dohandle2() {
        System.out.println("calling "+this.getClass().getSimpleName()+" method: dohandle2");
        getImplemetor().handleBImpl();
    }
}
