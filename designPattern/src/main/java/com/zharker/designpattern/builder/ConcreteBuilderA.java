package com.zharker.designpattern.builder;

public class ConcreteBuilderA implements AbstractBuilder {

    @Override
    public AbstractComplexProduct buildProduct() {
        return new ComplexProductA();
    }

    public void buildPart1(){
        System.out.println("ConcreteBuilderA run buildPart1");
    }


    public void buildPart2(){
        System.out.println("ConcreteBuilderA run buildPart2");
    }


    public void buildPart3(){
        System.out.println("ConcreteBuilderA run buildPart3");
    }
}
