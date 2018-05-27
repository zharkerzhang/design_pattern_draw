package com.zharker.designpattern.singleton;

public final class StarvingSingleton {
    private static final StarvingSingleton instnace = new StarvingSingleton();
    private StarvingSingleton(){}
    public static StarvingSingleton getInstnace(){ return instnace; }
}
