package com.zharker.designpattern.decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method2(){
        System.out.println("ConcreteDecorator2 method2");
    }

    @Override
    public void operate() {
        super.operate();
        this.method2();

    }
}
