package com.zharker.designpattern.component.securityimplement;

public abstract class Component {

    private String name;

    public abstract void doSomething(String name);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
