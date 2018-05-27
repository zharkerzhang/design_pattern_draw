package com.zharker.designpattern.singleton;

public class SyncLazySingleton extends LazySingleton {

    private static LazySingleton instance = null;
    private SyncLazySingleton(){}
    public static final synchronized LazySingleton getIsntance(){
        if(instance == null){
            instance = new SyncLazySingleton();
        }
        return instance;
    }

}
