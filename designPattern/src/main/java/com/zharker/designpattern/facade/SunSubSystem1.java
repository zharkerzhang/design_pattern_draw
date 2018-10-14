package com.zharker.designpattern.facade;

public class SunSubSystem1 extends SubSystem1{
    @Override
    public void doOne() {
        System.out.println(this.getClass().getSimpleName());
    }
}
