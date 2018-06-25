package com.zharker.designpattern.builder;


public interface AbstractBuilder {

    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract void buildPart3();

    public AbstractComplexProduct buildProduct();
}
