package com.zharker.designpattern.visitor;

public abstract class Element {
    public abstract void doSomething();

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
