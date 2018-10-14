package com.zharker.designpattern.bridge;

public class ConcreteImplemetor1 extends Implemetor {
    @Override
    public void handleAImpl() {
        System.out.println("calling "+this.getClass().getSimpleName()+" method: handleAImpl");
    }

    @Override
    public void handleBImpl() {
        System.out.println("calling "+this.getClass().getSimpleName()+" method: handleBImpl");
    }
}
