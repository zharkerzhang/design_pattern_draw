package com.zharker.designpattern.facade;

public class Facade {

    private SubSystem1 subSystem1 = new SunSubSystem1();
    private SubSystem2 subSystem2 = new SubSystem2();
    private SubSystem3 subSystem3 = new SubSystem3();

    public void one(){
        subSystem1.doOne();
    }

    public void two(){
        subSystem2.doTwo();
    }

    public String three(Integer i){
        return subSystem3.doThree(i);
    }
}
