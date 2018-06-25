package com.zharker.designpattern.templatemethod;

public class ConCreteTemplate2 extends AbstractTemplate {
    @Override
    protected void doSomething() {
        System.out.println(this.getClass().getSimpleName()+" do something");
    }

    @Override
    protected void doAnything() {
        System.out.println(this.getClass().getSimpleName()+" do anything");
    }

    @Override
    protected boolean isDoSomething() {
        return true;
    }
}
