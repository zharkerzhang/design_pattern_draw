package com.zharker.designpattern.decorator;

public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent operate");
    }
}
