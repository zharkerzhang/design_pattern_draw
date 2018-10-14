package com.zharker.designpattern.visitor;

public class ConcreteElement2 extends Element{

    private String name;
    private String state;

    public ConcreteElement2(String name, String state) {
        this.name = name;
        this.state = state;
    }

    @Override
    public void doSomething() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ConcreteElement2{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
