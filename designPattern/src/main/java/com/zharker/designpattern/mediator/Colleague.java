package com.zharker.designpattern.mediator;

public abstract class Colleague {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        mediator.addColleage(this.getClass().getSimpleName(),this);
    }

    public void doSelf(){
        System.out.println(this.getClass().getSimpleName()+" instance do self");

    }

    public void doOtherCall(Colleague c){
        System.out.println(this.getClass().getSimpleName()+" instance do other call");
        c.doOther();
    }

    public void doOther(){
        System.out.println(this.getClass().getSimpleName()+" inscance do other");
    }
}
