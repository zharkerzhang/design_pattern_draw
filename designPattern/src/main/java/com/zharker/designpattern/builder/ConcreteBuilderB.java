package com.zharker.designpattern.builder;

public class ConcreteBuilderB implements AbstractBuilder {

    @Override
    public AbstractComplexProduct buildProduct() {
        return new ComplexProductB();
    }

    public void buildPart1(){
        System.out.println("ConcreteBuilderB run buildPart1");
    }


    public void buildPart2(){
        System.out.println("ConcreteBuilderB run buildPart2");
    }


    public void buildPart3(){
        System.out.println("ConcreteBuilderB run buildPart3");
    }
}
