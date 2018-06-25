package com.zharker.designpattern.builder;

public class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    public AbstractComplexProduct getProduct(){
        this.builder.buildPart1();
        this.builder.buildPart2();
        this.builder.buildPart3();
        return this.builder.buildProduct();
    }
}
