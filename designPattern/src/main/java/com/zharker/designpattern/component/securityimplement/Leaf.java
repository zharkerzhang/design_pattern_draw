package com.zharker.designpattern.component.securityimplement;

public class Leaf extends Component {
    @Override
    public void doSomething(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": "+super.getName();
    }
}
