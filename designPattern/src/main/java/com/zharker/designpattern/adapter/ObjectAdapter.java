package com.zharker.designpattern.adapter;

public class ObjectAdapter implements Target {

    private Adaptee1 adaptee1 = new Adaptee1();
    private Adaptee2 adaptee2 = new Adaptee2();
    private Adaptee3 adaptee3 = new Adaptee3();

    public ObjectAdapter() {}

    public ObjectAdapter(Adaptee1 adaptee1, Adaptee2 adaptee2, Adaptee3 adaptee3) {
        this.adaptee1 = adaptee1;
        this.adaptee2 = adaptee2;
        this.adaptee3 = adaptee3;
    }

    @Override
    public void request() {
        this.adaptee1.doSomething();
        this.adaptee2.doSomething();
        this.adaptee3.doSomething();
    }
}
