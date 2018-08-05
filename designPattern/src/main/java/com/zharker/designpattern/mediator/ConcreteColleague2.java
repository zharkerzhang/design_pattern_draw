package com.zharker.designpattern.mediator;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }


    public void doOtherCall(ConcreteColleague1 c){ //TODO
        System.out.println(this.getClass().getSimpleName()+" instance do other call");
        c.doOther();
    }
}
