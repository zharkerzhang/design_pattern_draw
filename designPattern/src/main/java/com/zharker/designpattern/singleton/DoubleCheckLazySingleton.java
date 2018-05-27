package com.zharker.designpattern.singleton;

public class DoubleCheckLazySingleton extends LazySingleton {

    private static LazySingleton instance = null;
    private DoubleCheckLazySingleton(){};
    public static final LazySingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLazySingleton.class){
                if(instance == null){
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }

}
