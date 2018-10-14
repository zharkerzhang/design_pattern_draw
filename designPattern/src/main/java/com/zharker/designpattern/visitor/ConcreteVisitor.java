package com.zharker.designpattern.visitor;

public class ConcreteVisitor implements Visitor {

    private double element1Percent=0;
    private int count=1;
    private int element1Count=0;

    @Override
    public void visit(Element element) {
        element.doSomething();
        count++;
        if(element instanceof ConcreteElement1){
            element1Count++;
        }
    }

    public double getElement1Percent(){

        return (element1Count*10/(count-1))*0.1 ;
    }
}
