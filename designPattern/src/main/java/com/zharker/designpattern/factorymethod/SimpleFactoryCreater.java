package com.zharker.designpattern.factorymethod;

public class SimpleFactoryCreater {

    public static <T extends Product> T createProduct(Class<T> c){
        T p = null;
        try {
            System.out.println("SimpleFactoryCreater create Product instance");

            p = (T)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return p;
    }
}
