package com.zharker.designpattern.singleton;

public class StaticInnerLazySingleton extends LazySingleton {

    private static class LazySingletonInstance{
        private static final LazySingleton instance = new StaticInnerLazySingleton();
    }
    private StaticInnerLazySingleton(){}
    public static final LazySingleton getInstance(){
        return LazySingletonInstance.instance;
    }

}
