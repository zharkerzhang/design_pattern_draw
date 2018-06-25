package com.zharker.designpattern.factorymethod;

public class ConcreteCreater implements Creater {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
