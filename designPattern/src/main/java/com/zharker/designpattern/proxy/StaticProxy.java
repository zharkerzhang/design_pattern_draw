package com.zharker.designpattern.proxy;

public class StaticProxy extends AbstractProxy implements Subject {

    private Subject subject;

    public StaticProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doSomething() {
        before();
        subject.doSomething();
        after();
    }

    public void after() {
        System.out.println("proxy do after subject done");
    }

    public void before() {
        System.out.println("proxy do before subject do");
    }
}
