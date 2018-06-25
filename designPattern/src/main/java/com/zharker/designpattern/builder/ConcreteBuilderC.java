package com.zharker.designpattern.builder;

public class ConcreteBuilderC implements AbstractBuilder {

    @Override
    public AbstractComplexProduct buildProduct() {
        return new ComplexProductC();
    }

    public void buildPart1(){
        System.out.println("ConcreteBuilderC run buildPart1");
    }


    public void buildPart2(){
        System.out.println("ConcreteBuilderC run buildPart2");
    }


    public void buildPart3(){
        System.out.println("ConcreteBuilderC run buildPart3");
    }
}
