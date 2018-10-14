package com.zharker.designpattern.flyweight;

public class ConcreteFlyweight extends Flyweight{

    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        System.out.println(super.getIntrinsic());
    }
}
