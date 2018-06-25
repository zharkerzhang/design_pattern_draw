package com.zharker.designpattern.templatemethod;

public abstract class AbstractTemplate {
    protected abstract void doSomething();
    protected abstract void doAnything();
    protected abstract boolean isDoSomething();

    public final void templateMethod(){
        this.doAnything();
        if(this.isDoSomething()){
            this.doSomething();
        }
    }
}
